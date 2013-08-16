package com.mzielinski.scjp.operations;

/**
 * @author mzielinski, Rule Financial
 */
public class OpTest1 {
    public static void main(String[] args) {
        int a = -5;
        int b = -2;
        a %= b;
        a /= b;
        b = a > 0 ? 1 : a;
        System.out.println(a + " " + b);
    }
}
