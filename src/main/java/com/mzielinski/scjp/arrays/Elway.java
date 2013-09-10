package com.mzielinski.scjp.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */
public class Elway {

    public static void main(String[] args) {
        ArrayList[] ls = new ArrayList[6];
        for (int i = 0; i < 6; i++) {
            ls[i] = new ArrayList();
            ls[i].add("a" + i);
        }
        List[] o = ls;
        do3(ls);
        for (int i = 0; i < 6; i++) {
            System.out.print(((Object[]) o)[i] + " ");
        }
    }

    static Object do3(ArrayList[] a) {
        for (int i = 0; i < 3; i++) a[i].add("e");
        return a;

    }
}
