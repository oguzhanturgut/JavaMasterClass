package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();


//        Bird bird = new Bird("Parrot");
//        bird.breath();
//        bird.eat();
        Parrot parrot = new Parrot("Austalian rigneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
