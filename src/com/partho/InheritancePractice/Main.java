package com.partho.InheritancePractice;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
//        System.out.println(box1.l);
//        System.out.println(box1.h);
//        System.out.println(box1.w);

        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.weight);

        Box box3 = new BoxWeight(2, 3, 4, 5);

//        System.out.println(box3.l);
//        System.out.println(box3.h);
//        System.out.println(box3.w);
//        System.out.println(box3.weight);

        // Object type --> BoxWeight // subclass
        // Ref var type --> Box // superclass

//        BoxWeight box4 = new Box(1,2,3);
    }
}
