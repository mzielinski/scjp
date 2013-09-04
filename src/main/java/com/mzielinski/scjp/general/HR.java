package com.mzielinski.scjp.general;

import java.util.List;
import java.util.Vector;

/**
 * @author mzielinski, Rule Financial
 */
public class HR {
    public static void main(String[] args) {
        List<Integer> i = new Vector<Integer>();
        i.add(3);
        i.add(2);
        i.add(5);
        int ref = 1;
        doStuff(ref);
        System.out.println(i.get(ref));
    }

    static int doStuff(int x) {
        return ++x;
    }
}
