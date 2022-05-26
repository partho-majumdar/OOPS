package com.partho.SeparateClassInterface;

public class Main {
    public static void main(String[] args) {

        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();

        car.upgradeEngine();
        car.start();
    }
}
