package com.gevernova.javaeightfeatures.problemstatements.policyholderriskasssessment;

public class PolicyHolder {
    private int holderId;
    private String name;
    private int age;
    private String policyType;
    private double premiumAmount;

    public PolicyHolder(int holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    public int getHolderId() {
        return holderId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPolicyType() {
        return policyType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return "\nPolicyHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", policyType='" + policyType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
