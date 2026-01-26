package com.gevernova.javaeightfeatures.problemstatements.claimanalysis;

import java.time.LocalDate;

public class Claim {
    private int claimId;
    private String policyNumber;
    private double claimAmount;
    private LocalDate claimDate;
    private String status;

    public Claim(int claimId, String policyNumber, double claimAmount, LocalDate claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    public int getClaimId() {
        return claimId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "\nClaim{" +
                "claimId=" + claimId +
                ", policyNumber='" + policyNumber + '\'' +
                ", claimAmount=" + claimAmount +
                ", claimDate=" + claimDate +
                ", status='" + status + '\'' +
                '}';
    }
}
