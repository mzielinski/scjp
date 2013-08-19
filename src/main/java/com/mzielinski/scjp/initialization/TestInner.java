package com.mzielinski.scjp.initialization;

/**
 * User: mzielinski
 * Date: 7/31/13 9:47 PM
 */
public class TestInner {
    private static int i = 10;

    private static void f() {
        System.out.println(i);
    }

    TestInner() {
        System.out.print("Outer");
    }

    class MyInner {
        MyInner() {
            System.out.print("Inner");
        }

        void g() {
            f();
        }
    }

    public static void main(String[] args) {
        new TestInner().new MyInner();
    }
}