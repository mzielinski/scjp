package com.mzielinski.scjp.comparators;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author mzielinski, Rule Financial
 */
public class ListOfStringSort {

    public static void main(String... args) {
        Vector<String> aList = new Vector<String>();
        aList.add("USA");
        aList.add("Russia");
        aList.add("USA");
        aList.add("UK");
        List<?> list = aList;
        Collections.sort(aList);
        for (Object s : list)
            System.out.print(s);
    }
}
