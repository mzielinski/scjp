package com.mzielinski.scjp.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzielinski, Rule Financial
 */
public class Garage {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        String[] k = {null, "2", "3", null, "5"};
        String[] v = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < 5; i++) {
            hm.put(k[i], v[i]);
            System.out.print(hm.get(k[i]) + " ");
        }
        System.out.print(hm.size() + " " + hm.values() + "\n");
    }

}
