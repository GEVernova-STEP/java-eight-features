package com.gevernova.javaeightfeatures.problemstatements.frauddetection;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, "001", 12000, LocalDate.now(), true),
                new Transaction(2, "001", 15000, LocalDate.now(), true),
                new Transaction(3, "001", 8000, LocalDate.now(), true),
                new Transaction(4, "002", 20000, LocalDate.now(), true),
                new Transaction(5, "002", 18000, LocalDate.now(), true),
                new Transaction(6, "002", 17000, LocalDate.now(), true),
                new Transaction(7, "002", 16000, LocalDate.now(), true),
                new Transaction(8, "002", 14000, LocalDate.now(), true),
                new Transaction(9, "003", 9000, LocalDate.now(), false),
                new Transaction(10, "003", 60000, LocalDate.now(), true)
        );

        //Filter
        List<Transaction> fraudulentTransactions = transactions.stream()
                .filter(Transaction::isFraudulent).filter(t -> t.getAmount() > 10_000)
                .toList();
        System.out.println("Filtered Fraudulent Transactions: " + fraudulentTransactions);

        //Group
        Map<String, List<Transaction>> groupedByPolicy = transactions.stream()
                .filter(Transaction::isFraudulent).collect(Collectors.groupingBy(Transaction::getPolicyNumber));
        System.out.println("\nFraudulent Transactions Grouped by Policy: " + groupedByPolicy);

        //Aggregate
        Map<String, FraudSummary> fraudSummaryByPolicy = transactions.stream()
                .filter(Transaction::isFraudulent).collect(
                        Collectors.groupingBy(
                                Transaction::getPolicyNumber,
                                Collectors.collectingAndThen(
                                        Collectors.summarizingDouble(Transaction::getAmount),
                                        stats -> new FraudSummary(
                                                stats.getCount(),
                                                stats.getSum()
                                        )
                                )
                        )
                );
        System.out.println("\nFraud Summary By Policy: " + fraudSummaryByPolicy);

        //Alert
        List<String> alertPolicies = fraudSummaryByPolicy.entrySet().stream()
                .filter(e -> e.getValue().getFraudCount() > 5 || e.getValue().getTotalFraudAmount() > 50_000)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("\nAlert Policies: " + alertPolicies);
    }
}
