package com.mzielinski.scjp.number;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author mzielinski, Rule Financial
 */
public class TestNumber {

    public static void main(String... args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        try {
            Number number = numberFormat.parse("4,455.67");
            System.out.println(number.intValue());
        } catch (java.text.ParseException ex) {
            System.out.println("Error");
        }
    }
}
