package com.partho.PolymorphismPractice;

public class Main {
    public static void main(String[] args) {
//        Shapes obj1 = new Shapes();
//        obj1.area();

//        Square obj3 = new Square();
//        obj3.area();

//        Circle obj2 = new Circle(); // if i remove area form Shapes it will give me error
//        obj2.area();

        Shapes obj4 = new Square();
        obj4.area();

        // overriding --> when a child class has a method name same as parent class method
        // It should print "I am in shape" but it prints "I am in square" ? --> Overriding
        // this happens in run time that's why it is known as dynamic polymorphism
        // Dynamic Method Dispatch --> During runtime
    }
}
