package com.company;

public class VipMembers {

    private String vipName;
    private String vipEmail;
    private double creditLimit;

    // default constructor
    public VipMembers() {
        this("Elleigh", "EAS@gmail.com", 1000000.00);
        System.out.println("Empty constructor called. Defaults now set");
    }

    public VipMembers(String vipName, double creditLimit) {
       this(vipName, "unknown@gmail.com", creditLimit);
    }

    // setup constructor
    public VipMembers(String vipName, String vipEmail, double creditLimit) {
        this.vipName = vipName;
        this.vipEmail = vipEmail;
        this.creditLimit = creditLimit;
    }

    // Getters
    public String getVipName() {
        return vipName;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
