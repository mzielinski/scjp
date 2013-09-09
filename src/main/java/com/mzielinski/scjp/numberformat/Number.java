package com.mzielinski.scjp.numberformat;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Number {

    public Number() { // synchronized  is not allowed here
    }

    public static void main(String... args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
        numberFormat.setMaximumFractionDigits(2);
//        numberFormat.setFractionDigits(2);
        numberFormat.setMinimumFractionDigits(1);
//        numberFormat.setDecimalDigits(2);
//        numberFormat.setMaximumDecimalDigits(2);
        System.out.println(numberFormat.format(54567.678));

        String str = "aaaaaaaaabb";
        String [] s = str.split("a{3}");
        System.out.println(Arrays.asList(s));

    }
}
