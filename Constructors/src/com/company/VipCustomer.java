package com.company;

public class VipCustomer {
    String name;
    Double creditLimit;
    String email;

    public VipCustomer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Default Name", 0.00, "qwe@qwe.com");
    }

    public VipCustomer(String name, Double creditLimit) {
        this(name, creditLimit, "default@asad.com");
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
