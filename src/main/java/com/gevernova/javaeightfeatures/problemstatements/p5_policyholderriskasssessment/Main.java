package com.gevernova.javaeightfeatures.problemstatements.p5_policyholderriskasssessment;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder(1, "Ashutosh", 65, "Life", 40000),
                new PolicyHolder(2, "Atul", 58, "Life", 30000),
                new PolicyHolder(3, "Roshan", 70, "Life", 50000),
                new PolicyHolder(4, "Ankit", 62, "Health", 45000),
                new PolicyHolder(5, "Raman", 75, "Life", 60000)
        );

        //Filter
        List<PolicyHolder> filteredHolders = holders.stream()
                .filter(h -> h.getPolicyType().equalsIgnoreCase("Life") && h.getAge() > 60)
                .toList();
        System.out.println("Filtered Policy Holders: " + filteredHolders);

        //Transform
        List<RiskAssessment> riskAssessments = holders.stream()
                .map(h -> new RiskAssessment(
                        h.getHolderId(),
                        h.getName(),
                        h.getPremiumAmount() / h.getAge()
                ))
                .toList();
        System.out.println("\nRisk Assessments: " + riskAssessments);

        //Sort
        List<RiskAssessment> sortedByRisk = riskAssessments.stream()
                .sorted(Comparator.comparing(RiskAssessment::getRiskScore).reversed())
                .toList();
        System.out.println("\nSorted by Risk Score (Descending): " + sortedByRisk);

        //Categorize
        Map<String, List<RiskAssessment>> categorized = riskAssessments.stream()
                .collect(Collectors.groupingBy(r -> r.getRiskScore() > 0.5 ? "High Risk" : "Low Risk"));
        System.out.println("\nRisk Categories: " + categorized);
    }
}

