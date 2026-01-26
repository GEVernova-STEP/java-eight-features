package com.gevernova.javaeightfeatures.problemstatements.claimanalysis;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim(1, "001", 8000, LocalDate.now(), "Approved"),
                new Claim(2, "002", 4000, LocalDate.now(), "Rejected"),
                new Claim(3, "003", 12000, LocalDate.now(), "Approved"),
                new Claim(4, "004", 6000, LocalDate.now(), "Approved"),
                new Claim(5, "005", 3000, LocalDate.now(), "Approved"),
                new Claim(6, "005", 15000, LocalDate.now(), "Approved"),
                new Claim(7, "006", 20000, LocalDate.now(), "Approved")
        );

        //Filter
        List<Claim> filteredClaims = claims.stream()
                .filter(c -> c.getStatus().equalsIgnoreCase("Approved") && c.getClaimAmount() > 5000)
                .toList();
        System.out.println("Filtered Claims: " + filteredClaims);

        //Group
        Map<String, List<Claim>> claimsByPolicy = claims.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber));
        System.out.println("\nClaims Grouped by Policy: " + claimsByPolicy);

        //Aggregate
        Map<String, PolicyClaimSummary> policySummary = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getPolicyNumber,
                        Collectors.collectingAndThen(
                                Collectors.summarizingDouble(
                                        Claim::getClaimAmount),
                                        stats -> new PolicyClaimSummary(
                                        stats.getSum(),
                                        stats.getAverage()
                                )
                        )
                ));
        System.out.println("\nPolicy Claim Summary: " + policySummary);

        //Top 3 Policies
        List<Map.Entry<String, PolicyClaimSummary>> top3Policies = policySummary.entrySet().stream()
                .sorted((e1, e2) ->
                        Double.compare(
                                e2.getValue().getTotalAmount(),
                                e1.getValue().getTotalAmount()
                        )
                )
                .limit(3)
                .toList();
        System.out.println("\nTop 3 Policies by Total Claim Amount: " + top3Policies);
    }
}
