package com.gevernova.javaeightfeatures.problemstatements.claimanalysis;

public class PolicyClaimSummary {
    private double totalAmount;
    private double averageAmount;

    public PolicyClaimSummary(double totalAmount, double averageAmount) {
        this.totalAmount = totalAmount;
        this.averageAmount = averageAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getAverageAmount() {
        return averageAmount;
    }

    @Override
    public String toString() {
        return "\nPolicyClaimSummary{" +
                "totalAmount=" + totalAmount +
                ", averageAmount=" + averageAmount +
                '}';
    }
}

