package com.mzielinski.scjp.exam3;

/**
 * @author mzielinski, Rule Financial
 */
public class ThrowIllegalArgumentException {

    static String s = "";

    public static void main(String[] args) {
        try {
            doStuff(args);
        } catch (Error e) {
            s += "e ";
        }
        s += "x ";
        System.out.println(s);
    }

    static void doStuff(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException();
        s += "d ";
    }


}