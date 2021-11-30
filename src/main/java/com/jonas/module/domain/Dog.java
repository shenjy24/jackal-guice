package com.jonas.module.domain;

public class Dog implements Animal {
    @Override
    public void talk() {
        System.out.println("I am dog!");
    }
}
