package com.mzielinski.scjp.switchs;

/**
 * @author mzielinski, Rule Financial
 */
public class Test {
    public static void main(String[] args) {
        float i = 0;
        final byte j = 5;
        final short s = 4;
        while (i < 5) {
            switch ((int) i + 2) {
                default:
                case j: System.out.println("one");
                case s + 2:
                {
                    System.out.println("two");
                    break;
                }
            }
            i++;
        }
    }

}
