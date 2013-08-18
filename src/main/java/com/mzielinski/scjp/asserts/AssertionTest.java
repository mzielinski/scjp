package com.mzielinski.scjp.asserts;

/**
 * @author mzielinski, Rule Financial
 */
public class AssertionTest {

    public static int y;
    public static int foo(int x) {
        System.out.println("foo");
        return y = x;
    }
    public static int bar(int z) {
        System.out.println("bar");
        return y = z;
    }

    public static void main(String[] args) {
        int t = 0;
        assert t < 4 : bar(10);
        assert t > 1 : foo(11);

        System.out.println("Done");
    }
}
