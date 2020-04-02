package com.company;

public class Main {

    public static void main(String[] args) {

//        ITelephone timsPhone;
//        timsPhone = new DeskPhone(123456);
        ITelephone timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(2345678);
        timsPhone.powerOn();
        timsPhone.callPhone(2345678);
        timsPhone.answer();

    }
}
