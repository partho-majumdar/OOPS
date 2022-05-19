package com.partho.StaticExample;

public class NewClass {
    static class Cover {
        public void foo() {
            System.out.println("Inside foo");
        }
    }

    void bar() {
        System.out.println("Inside bar");
    }

    public static void main(String[] args) {
        NewClass a = new NewClass();
        Cover b = new Cover();
        a.bar();
        b.foo();
    }
}
