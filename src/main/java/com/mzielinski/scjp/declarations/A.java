package com.mzielinski.scjp.declarations;

/**
 * @author mzielinski, Rule Financial
 */
class A {

    int increment(int x) {
        return x + 10;
    }

    long increment(long x) {
        return x + 20;
    }
}

class B extends A {
    public static void main(String[] args) {
        B b = new B();
        int y = b.increment(12);
        System.out.println(y);
    }
}
