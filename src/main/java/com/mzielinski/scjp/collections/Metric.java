package com.mzielinski.scjp.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */
public class Metric {

    public static void main(String[] args) {
        String[] s = {"1", "2", "3", "4", "5", "6"};
        List<String> list = Arrays.asList(s);
        list.set(4, "new 4");
        System.out.println(s[4]);
        s[2] = "new 2";
        System.out.println(list.get(2));
    }

}
