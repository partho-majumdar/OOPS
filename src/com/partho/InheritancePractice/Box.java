package com.partho.InheritancePractice;

// cannot override a method that is final
// final public class Box{ } --> this give me error
public class Box {
    private double l;
    double h;
    double w;
    double weight;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {

        super(); // this is main class form which every other class is created

        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
