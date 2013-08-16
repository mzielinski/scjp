package com.mzielinski.scjp.operations;

/**
 * @author mzielinski, Rule Financial
 */
public class Short {
    public static void main(String[] args) {
        int a = 0;
        StringBuffer s = new StringBuffer("Hello");
        if ( (s.length() < 10 | (s.append(" world").equals("Hello world")))) {
            System.out.println("true");
        }
        ;    // do nothing
        System.out.println("Value is - " + s);


        if(false | false) {

        }
    }
}
