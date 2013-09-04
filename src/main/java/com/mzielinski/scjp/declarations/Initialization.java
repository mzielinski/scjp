package com.mzielinski.scjp.declarations;

/**
 * @author mzielinski, Rule Financial
 */
public class Initialization {

    void f() {
        System.out.println("Outer");
    }

    int add(int i, int j) {
        return i + j;
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

                short s = 9;
                int add = t.add(s, 6);
                System.out.println(add);
            }
        };
        test.f();
    }
}

