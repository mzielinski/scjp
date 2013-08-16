package com.mzielinski.scjp.comparators;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mzielinski, Rule Financial
 */
public class Comp2 {

    public static void main(String... args) {
        String[] words = {"Good", "Bad", "Ugly"};

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.charAt(1) - s1.charAt(1);
            }
        };
        Arrays.sort(words, comparator);
        System.out.println(words[0]);
    }

}
