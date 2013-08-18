package com.mzielinski.scjp.asserts;

/**
 * @author mzielinski, Rule Financial
 */

public class AssertDemo {

    public static int y ;

    public static int foo(int x) {
        System.out.println("foo");
        return y = x;
    }

    public static int bar(int z) {
        System.out.println("bar");
        return y = z;
    }

    public static void main(String[] args) {
//        boolean assertEnabled = false;
//        assert assertEnabled != true : "to";

        int t = 2;
        assert t < 4 : "asdas" + bar(7);
        assert t > 1 : foo(2);

        System.out.println("Done");
//        System.out.println("Assertions are " + (assertEnabled ? "enabled" : "disabled"));
    }
}
