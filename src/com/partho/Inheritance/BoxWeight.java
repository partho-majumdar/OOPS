package com.partho.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
//        this.l; cannot access it l is private
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
