package com.mzielinski.scjp.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * User: mzielinski
 * Date: 8/13/13 9:04 PM
 */
public class HashTest implements Comparable<String> {

    private String str;

    public HashTest(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String args[]) {
        HashTest h1 = new HashTest("2");
        String s1 = new String("1");

        Object[] list = new Object[2];
        list[0] = h1;
        list[1] = s1;

        Arrays.sort(list);
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

    @Override
    public int compareTo(String o) {
        return this.str.compareTo(o);
    }

//    public static void main(String args[]) {
//        HashTest h1 = new HashTest("2");
//        String s1 = new String("1");
//
//        List<String> list = new LinkedList<String>();
////        list.add(h1);
//        list.add(s1);
//
//        Collections.sort(list);
//        for (Object o : list) {
//            System.out.print(o + " ");
//        }
//    }
}