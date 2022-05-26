package com.partho.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
//        obj.acc();
//        obj.start();
//        obj.stop();
//        obj.brake();

        Engine obj2 = new Car();
        obj2.start();
        obj2.stop();
        obj2.acc();
//        obj2.brake(); this will give me error
    }
}
