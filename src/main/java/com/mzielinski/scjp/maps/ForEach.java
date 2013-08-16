package com.mzielinski.scjp.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author mzielinski, Rule Financial
 */
public class ForEach {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        // 1
        for (Map.Entry pairs : map.entrySet()){}

        // 2
        Iterator i = map.entrySet().iterator();

        // 3
//        Iterator j = map.iterator();

        // 4
        Iterator<Map.Entry<Integer, String>> k = map.entrySet().iterator();

        // 5
//        Iterator<Map.Entry> l = map.entrySet().iterator();

//
//        ---------------------
//
//        ArrayList<Double> a = new ArrayList<Double>();
//        a.add(new Integer(4));
//        System.out.println(a);
    }
}
