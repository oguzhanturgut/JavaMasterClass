package com.company;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account("12345", 0.00,"Bob Brown","email@bob.com","123455789");
//        System.out.println(bobsAccount.getCustomerEmailAddress());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(102);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAccountNumber() + " name "+ timsAccount.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 100.0, "dsdf@sfdsdf.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
    }

}
