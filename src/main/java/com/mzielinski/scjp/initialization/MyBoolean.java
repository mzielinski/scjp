package com.mzielinski.scjp.initialization;

/**
 * User: mzielinski
 * Date: 7/31/13 9:50 PM
 */
public class MyBoolean {

    boolean bool[] = new boolean[5];

    public static void main(String[] args) {
        new MyBoolean().myMethod();
    }

    public void myMethod() {
        if (bool[1] == true) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
    }
}