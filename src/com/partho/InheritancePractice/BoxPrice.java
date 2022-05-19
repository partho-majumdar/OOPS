package com.partho.InheritancePractice;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        this.price = -1;
    }

    BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
