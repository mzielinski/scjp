package com.mzielinski.scjp.dates;

import java.util.Calendar;
import java.util.Locale;

/**
 * @author mzielinski, Rule Financial
 */
public class Wise {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(new Locale("pl"));
        c.set(1999, 11, 25);
        c.roll(Calendar.MONTH, 1);
        c.add(Calendar.DATE, 10);
        System.out.println(c.getTime());
    }
}
