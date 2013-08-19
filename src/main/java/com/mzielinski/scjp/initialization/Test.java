package com.mzielinski.scjp.initialization;

/**
 * User: mzielinski
 * Date: 8/12/13 10:59 PM
 */
public class Test {

    int x;
    int y = 5;

    Test(int i) {
        y = x + i;
    }

    public static void main(String[] args) {
        Test t = new Test(10);
        System.out.println(t.y);
    }

}
