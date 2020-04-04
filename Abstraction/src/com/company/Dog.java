package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eathing");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }
}
