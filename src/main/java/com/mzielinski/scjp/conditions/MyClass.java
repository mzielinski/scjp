package com.mzielinski.scjp.conditions;

/**
 * @author mzielinski, Rule Financial
 */
public class MyClass {

    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        boolean b = false;
        if (b = i == j)
            System.out.println("True");
        else
            System.out.println("False");
    }

}
