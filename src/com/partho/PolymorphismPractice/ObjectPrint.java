package com.partho.PolymorphismPractice;

public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    // make my own to string method
    @Override
    public String toString() {
        return "num = " + 5;
    }

    public static void main(String[] args) {
        ObjectPrint myObj = new ObjectPrint(5);
        System.out.println(myObj);
    }
}
