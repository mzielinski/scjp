package com.mzielinski.scjp.operations;

/**
 * @author mzielinski, Rule Financial
 */
public class Short {
    public static void main(String[] args) {

//        StringBuilder s = "hello";
//        String s1 = null;
//        s.append(s1);
//        System.out.println(s);

        int a = 0;
        StringBuffer stringBuffer = new StringBuffer("Hello");
        if ( (stringBuffer.length() < 10 | (stringBuffer.append(" world").equals("Hello world")))) {
            System.out.println("true");
        }
        ;    // do nothing
        System.out.println("Value is - " + stringBuffer);


        if(false | false) {

        }
    }
}
