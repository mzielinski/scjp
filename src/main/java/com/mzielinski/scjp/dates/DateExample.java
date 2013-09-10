package com.mzielinski.scjp.dates;

import java.util.Date;

/**
 * @author mzielinski, Rule Financial
 */
public class DateExample {

    public static void main(String... args) {
        Date d1 = new Date();
        Date d2 = d1;
        System.out.println(d1);
        d2.setTime(d1.getTime() + (7 * 24 * 60 * 60));
        System.out.println(d2);
    }
}
