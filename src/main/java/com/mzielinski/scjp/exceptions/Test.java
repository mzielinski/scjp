package com.mzielinski.scjp.exceptions;

/**
 * @author mzielinski, Rule Financial
 */
class SuperTest {
    int f() {
        return 0;
    }
}

public class Test extends SuperTest {
    int i;

    protected int f() throws Error {
        return i;
    }

    Test(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        SuperTest t = new Test(5);
        System.out.println(t.f());
    }
}