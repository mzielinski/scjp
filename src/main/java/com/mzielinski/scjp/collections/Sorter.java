package com.mzielinski.scjp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * User: mzielinski
 * Date: 8/12/13 10:47 PM
 */
public class Sorter {

    private class A {
        void getMe() {
        }
    }

    private class B extends A {
        void getMe() {
        }
    }

    public static void main(String[] args) {
        List<String> aList = new ArrayList<String>();
        aList.add("USA");
        aList.add("Russia");
        aList.add("UK");
        Collections.sort(aList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        int pos = Collections.binarySearch(aList, "USA");
        System.out.println(pos);
    }

}
