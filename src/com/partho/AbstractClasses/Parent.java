package com.partho.AbstractClasses;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

//    Can we create abstract constructor? No
//    abstract Parent();

    abstract void career();

    abstract void partner();
}
