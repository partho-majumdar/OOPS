package com.partho.AbstractClasses;

public abstract class Parent {

//    can't use final method here final prevent to overriding and inheritance but here
//    we wanted to being inherited

    int age;

    public Parent(int age) {
        this.age = age;
    }

//    Can we create abstract constructor? No
//    abstract Parent();

    abstract void career();

    abstract void partner();
}
