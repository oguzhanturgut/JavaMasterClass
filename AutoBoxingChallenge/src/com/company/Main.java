package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("ABN Ambro");

        bank.addBranch("Amsterdam");

        bank.addCustomer("Amsterdam", "John", 25.55);
        bank.addCustomer("Amsterdam", "Jane", 156.75);
        bank.addCustomer("Amsterdam", "Joe", 234.80);

        bank.addBranch("Utrecht");

        bank.addCustomer("Utrecht", "Tim", 101.25);

        bank.addCustomerTransaction("Amsterdam", "John", 24.55);
        bank.addCustomerTransaction("Amsterdam", "Jane", -34.25);
        bank.addCustomerTransaction("Amsterdam", "John", 1003.50);

        bank.listCustomers("Amsterdam", true);
        bank.listCustomers("Utrecht", true);


    }
}
