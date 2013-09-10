package com.mzielinski.scjp.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mzielinski, Rule Financial
 */
public class Salt {

    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(0);
        s1.add("1");
        doStuff(s1);
    }

    static void doStuff(Set<Number> s) {
        do2(s);
        Iterator i = s.iterator();
        while (i.hasNext()) System.out.print(i.next() + " ");
        Object[] oa = s.toArray();
        for (int x = 0; x < oa.length; x++)
            System.out.print(oa[x] + " ");
        System.out.println(s.contains(1));
    }

    static void do2(Set s2) {
        System.out.print(s2.size() + " ");
    }

}
