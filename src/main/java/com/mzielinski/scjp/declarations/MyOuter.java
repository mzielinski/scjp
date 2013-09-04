package com.mzielinski.scjp.declarations;

/**
 * @author mzielinski, Rule Financial
 */
class MyOuter {

    class MyInner {
        float f() {
            return 1.2f;
        }
    }

    MyInner getInner() {
        return new MyInner();
    }
}

class Test {
    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        System.out.println(outer.getInner().f());
    }
}