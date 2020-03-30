package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 34.56);
        Customer anotherCustomer;
        anotherCustomer = customer;  // copying reference

        anotherCustomer.setBalance(12.33);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(4);
        intList.add(7);

        for (Integer integer : intList) {
            System.out.println(integer);
        }

        intList.add(1,2); // inserting 2 to index 1

        for (Integer integer : intList) {
            System.out.println(integer);
        }

    }
}
