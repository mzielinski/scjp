package com.mzielinski.scjp.switchs;

/**
 * @author mzielinski, Rule Financial
 */
public class Base {

    private void test() {
        int i = 66;
        switch (i) {
            case 'A':
                System.out.println("zero");
                break;
            case 'B':
                System.out.println("one");
            case 'C':
                System.out.println("two");
            default:
                System.out.println("default");
        }
    }

    public static void main(String[] args) {
        new Base().test();
    }

}
