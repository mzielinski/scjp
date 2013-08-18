package com.mzielinski.scjp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mzielinski, Rule Financial
 */
interface InterfaceTest {
    public abstract void main(); // for sure cannot be static method in interface (
}

public class RegEx2 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\s\\w");
        Matcher matcher = p.matcher("12s 4 w 33 1");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

}
