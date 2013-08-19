package com.mzielinski.scjp.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * User: mzielinski
 * Date: 8/15/13 7:43 PM
 */
public class TryMe2 {

    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        Collections.reverse(list);
        Iterator iter = list.iterator();

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

}
