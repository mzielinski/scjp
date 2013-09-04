package com.mzielinski.scjp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mzielinski, Rule Financial
 */
public class Decaf {

    public static void main(String[] arg) {
        process("0([0-7])?");
        process("0([0-7])*");
        process("0([0-7])+");
    }

    private static void process(String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("1012 0208 430");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
    }

}
