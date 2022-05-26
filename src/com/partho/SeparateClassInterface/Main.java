package com.partho.SeparateClassInterface;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
