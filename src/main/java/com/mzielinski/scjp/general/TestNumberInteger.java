package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
public class TestNumberInteger {

    public static void main(String... args) {
        Integer[][] la = {{1, 2}, {3, 4, 5}};
        Number[] na = la[1];
        Number[] na2 = (Number[]) la[0];
        Object o = na2;
//        la[1] = (Number[]) o;
        la[0] = (Integer[]) o;
    }
}
