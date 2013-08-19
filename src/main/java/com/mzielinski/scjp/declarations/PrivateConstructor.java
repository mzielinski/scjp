package com.mzielinski.scjp.declaration;

/**
 * User: mzielinski
 * Date: 7/31/13 9:23 PM
 */

class A {

    int b = 10;

//    private
    A() {
        this.b = 7;
    }

    int f() {
        return b;
    }
}

class B extends A {
    int b;
}

public class PrivateConstructor {

    public static void main(String... args) {
        A a = new B();
        System.out.println(a.f());
    }

}
