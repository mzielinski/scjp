package com.mzielinski.scjp.declarations;

/**
 * @author mzielinski, Rule Financial
 */
public class Initialization {

    void f() {
        System.out.println("Outer");
    }

    public class InnerTest {
        InnerTest() {
            System.out.println("Inner constructor");
        }

        void f() {
            System.out.println("Inner f");
        }
    }

    public static void main(String[] args) {
        final Initialization t = new Initialization();
        Initialization.InnerTest test = t.new InnerTest() {
            public void f() {
                t.f();
                System.out.println("Sub Inner f");
            }
        };
        test.f();
    }
}

