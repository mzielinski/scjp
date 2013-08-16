package com.mzielinski.scjp.api;

import java.text.*;
import java.util.Locale;

/**
 * @author mzielinski, Rule Financial
 */
public class Gazillion {

    public static void main(String[] args) throws Exception {
        String s = "123.456xyz";
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println(nf.parse(s));
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(s));
    }

}
