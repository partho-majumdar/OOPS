package com.partho.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Private obj = new Private(10, "Kanu");
        obj.setNum(20);
        System.out.println(obj.getNum());
    }
}
