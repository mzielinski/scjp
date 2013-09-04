package com.mzielinski.scjp.comparators;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mzielinski, Rule Financial
 */
public class Unturned {

    public static void main(String[] args) {
        String[] towns = {"aspen", "vail", "t-ride", "dillon"};
        MySort ms = new MySort();
        Arrays.sort(towns, ms);
        System.out.println(Arrays.binarySearch(towns, "dillon"));
    }

    static class MySort implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }

}
