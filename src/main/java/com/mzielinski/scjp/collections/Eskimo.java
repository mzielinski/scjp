package com.mzielinski.scjp.collections;

import java.util.TreeSet;

/**
 * @author mzielinski, Rule Financial
 */
public class Eskimo {

    public static void main(String... args) {
        TreeSet<Integer> stuff = new TreeSet<Integer>();
        stuff.add(2);
        stuff.add(4);
        stuff.add(6);
        stuff.add(8);
        stuff.add(10);
        System.out.println(stuff.higher(6));
    }
}
