package com.partho.StaticMethod;

public class Practice {
    public static void main(String[] args) {
        Human kunal = new Human(22, "KK", 1400, false);
        Human rahul = new Human(27, "RR", 3400, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}