package com.mzielinski.scjp.declarations;

/**
 * @author mzielinski, Rule Financial
 */
abstract class SuperTest {
    static int i = 10;
}

class Test22 extends SuperTest implements Inter {

    final static int i;

    static {
        i = 9;
    }

    @Override
    public
    void f() { // w przykładzie nie było public
        System.out.println("i is " + i);
    }

    public static void main(String[] args) {
        Inter t = new Test22();
        t.f();
    }
}

interface Inter {

    int i = 1;
    void f();

}