package com.partho.ObjectAndClass;

public class Main {
    public static void main(String[] args) {

        Student2 random = new Student2();
        Student2 random2 = new Student2(18, "Maks", 88.5f);
        Student2 random3 = new Student2(28, "Sovapoti", 81.5f, 100000);

    }
}

class Student2 {
    int rno;
    String name;
    float marks;
    int salary;

    Student2() {
        this.rno = 25;
        this.name = "Kunal Kushwaha";
        this.marks = 94.7f;
    }

    Student2(int roll, String nam, float mark) {
        this.rno = roll;
        this.name = nam;
        this.marks = mark;
    }

    Student2(int roll, String nam, float mark, int income) {
        this.rno = roll;
        this.name = nam;
        this.marks = mark;
        this.salary = income;
    }
}