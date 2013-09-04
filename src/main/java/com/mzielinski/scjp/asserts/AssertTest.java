package com.mzielinski.scjp.asserts;

/**
 * @author mzielinski, Rule Financial
 */
public class AssertTest {

    public static void main(String[] args) {
        float f1 = Float.NaN;
        float f2 = f1;
        float f3 = 1.2f;

        try {
            assert (f2 == f1) : f2 = 2;
            f3 = 1.5f;
        } catch (AssertionError ae) {
            f3++;
        }

        f3 += f2;
        System.out.println("f3 = " + f3);
    }

}
