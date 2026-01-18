package com.gevernova.javaeightfeatures.problemstatements.p6_frauddetection;

class FraudSummary {
    private long fraudCount;
    private double totalFraudAmount;

    public FraudSummary(long fraudCount, double totalFraudAmount) {
        this.fraudCount = fraudCount;
        this.totalFraudAmount = totalFraudAmount;
    }

    public long getFraudCount() {
        return fraudCount;
    }

    public double getTotalFraudAmount() {
        return totalFraudAmount;
    }

    @Override
    public String toString() {
        return "\nFraudSummary{" +
                "fraudCount=" + fraudCount +
                ", totalFraudAmount=" + totalFraudAmount +
                '}';
    }
}
