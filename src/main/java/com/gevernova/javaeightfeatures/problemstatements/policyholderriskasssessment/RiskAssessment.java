package com.gevernova.javaeightfeatures.problemstatements.policyholderriskasssessment;

public class RiskAssessment {
    private int holderId;
    private String name;
    private double riskScore;

    public RiskAssessment(int holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }

    public int getHolderId() {
        return holderId;
    }

    public String getName() {
        return name;
    }

    public double getRiskScore() {
        return riskScore;
    }

    @Override
    public String toString() {
        return "\nRiskAssessment{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", riskScore=" + riskScore +
                '}';
    }
}
