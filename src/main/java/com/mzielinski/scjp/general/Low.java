package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class High {

    protected static String go(int... x) {
        return "hi";
    }
}

public class Low extends High {

    public static String go(Integer x, Integer y) {
        return "low";
    }

    public static void main(String... args) {
        System.out.println(go(9,27));
        System.out.println(go(81));
    }

}
