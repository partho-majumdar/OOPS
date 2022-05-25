package com.partho.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son obj1 = new Son(28);
        obj1.career();

        Daughter obj2 = new Daughter(20);
        obj2.partner();

        Parent obj3 = new Daughter(21);
        obj3.career();

        Parent obj4 = new Parent(69) {
            @Override
            void career() {
                System.out.println("I am career");
            }

            @Override
            void partner() {
                System.out.println("I have 4 wives");
            }
        };
        obj4.partner();

        // can not create object of abstract classes without this
//        {
//            @Override
//            void career() {
//            System.out.println("I am career");
//        }
//
//            @Override
//            void partner() {
//            System.out.println("I have 4 wives");
//        }
//        };

        StaticMethod.hello();
    }
}
