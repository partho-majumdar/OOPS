package com.partho.InheritancePractice;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        this.weight = weight;

//        System.out.println(this.weight);
//        System.out.println(super.weight); // here super represents Box class weight
    }
}
