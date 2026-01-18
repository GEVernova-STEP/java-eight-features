package com.gevernova.javaeightfeatures.problemstatements.p6_frauddetection;

import java.time.LocalDate;

class Transaction {
    private int transactionId;
    private String policyNumber;
    private double amount;
    private LocalDate transactionDate;
    private boolean isFraudulent;

    public Transaction(int transactionId, String policyNumber, double amount, LocalDate transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    @Override
    public String toString() {
        return "\nTransaction{" +
                "transactionId=" + transactionId +
                ", policyNumber='" + policyNumber + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", isFraudulent=" + isFraudulent +
                '}';
    }
}

