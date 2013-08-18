package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 */
class A {
    int i;

    A() {
    }
}

class B extends A {
    B(short i) {
        this.i = i;
        System.out.println("short");
    }

    B(float j) {
        i = (int) j;
        System.out.print("float");
    }
}

public class Test2 extends B {
    Test2() {
        super(4);
    }

    public static void main(String[] args) {
        System.out.print(new Test2().i); //line 1
    }
}