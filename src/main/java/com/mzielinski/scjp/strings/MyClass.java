package com.mzielinski.scjp.strings;

/**
 * @author mzielinski, Rule Financial
 */
public class MyClass {

    static String s1 = "I am unique!";

    public static void main(String[] args) {
        String s2 = "I am unique!";
        String s3 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s1);
        System.out.println(s3.equals(s1));

        System.out.println("");

        StringBuilder s4 = new StringBuilder("hello");
        StringBuilder s5 = new StringBuilder("hello");
        Float f1 = 9.0f;
        Double f2 = 9.0;
        System.out.println(f1.equals(f2));
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }

}
