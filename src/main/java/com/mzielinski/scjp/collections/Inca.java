package com.mzielinski.scjp.collections;

import java.util.*;

/**
 * @author mzielinski, Rule Financial
 */
public class Inca {

    public static void main(String[] args) {
        NavigableSet<Integer> stuff = new TreeSet<Integer>(Arrays.asList(2, 4, 6, 8, 10));

        printSet(stuff.headSet(4));
        printSet(stuff.headSet(4, true));
        printSet(stuff.tailSet(4));
        printSet(stuff.tailSet(4, false));

        System.out.println(stuff.floor(5));
        System.out.println(stuff.ceiling(5));

        System.out.println(stuff.lower(4));
        System.out.println(stuff.higher(4));
    }

    private static <T> void printSet(SortedSet<T> integers) {
        for (T integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
