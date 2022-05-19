package com.partho.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(1.2, 2.3, 3.4);
        Box box4 = new Box(box3);

//        System.out.println(box1.h + "  " + box1.w);
//        System.out.println((box2.w + "  " + box2.h));
//        System.out.println(box3.w + "  " + box3.h);
//        System.out.println(box4.w + "  " + box4.h);

        BoxWeight box11 = new BoxWeight();
        BoxWeight box12 = new BoxWeight(2, 3, 4, 6);
        System.out.println(box11.h + " " + box11.weight);

        Box box22 = new BoxWeight(2,3,4,5);
//        BoxWeight box23 = new Box();
    }
}
