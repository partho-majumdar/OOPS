package com.partho.Polymorphism;

public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Output = " + num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(64);
        System.out.println(obj);
    }
}
