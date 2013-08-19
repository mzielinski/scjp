package com.mzielinski.scjp.strings;

/**
 * User: mzielinski
 * Date: 8/15/13 7:47 PM
 */
public class EmptyStringsTest {
    public static boolean isEmpty(String s) {
        return (s == null || s.length() == 0);
    }

    public static void main(String args[]) {
        if (isEmpty(null)) {
            System.out.print("empty ");
        } else {
            System.out.print("not_empty ");
        }

        String str = null;
        if (str == null) {
            System.out.print("1");
        } else if (str.length() == 0) {
            System.out.print("2");
        } else {
            System.out.print("3");
        }
    }
}
