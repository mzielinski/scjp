package com.mzielinski.scjp.print;

import java.util.Date;

import static java.lang.Short.*;


/**
 * @author mzielinski, Rule Financial
 */
public class MathBoy {
    public static void main(String[] args) {
        long x = 123456789;
        short y = 22766; // maximum value of a short is 32767
        System.out.printf("%1$+10d %2$010d ", x, MAX_VALUE - y);
        System.out.println(new Date());
    }
}
