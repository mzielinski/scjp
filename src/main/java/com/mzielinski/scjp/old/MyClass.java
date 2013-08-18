package com.mzielinski.scjp.old;

/**
 * What will happen when you compile and run the following code?
 *
 * @author Maciej Zielinski, Rule Financial
 */
public class MyClass {

    private static int x = getValue();
    private static int y = 5;

    private static int getValue() {
        return y;
    }

    public static void main(String[] args) {
        System.out.println(y + " " + x);
    }

}
