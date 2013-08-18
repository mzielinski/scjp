package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class SuperFoo extends Foo {

//    public int test(float x) {
//        return 3;
//    }

    private int test(float x) {
        return 3;
    }

    @Override
    protected short test(float[] y) {
        return 5;
    }
}

public class Foo {
    protected short test(float[] y) {
        return 3;
    }
}
