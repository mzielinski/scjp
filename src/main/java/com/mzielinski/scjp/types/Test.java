package com.mzielinski.scjp.types;

/**
 * @author mzielinski, Rule Financial
 */
public class Test {

    public static void main(String[] args) {

        float i = 0;
        final byte j = 5;
        final short s = 4;

        while (i <= 5) {
            switch ((int) i + 2) {    //1
                default:            // 2
                    System.out.println("default");
                case j:
                    System.out.println("j: " + j);
                case (s + 2):            // 4
                {
                    System.out.println("s+2: " + (s+2));
                    break;
                }
            }
            i++;
        }
    }

}
