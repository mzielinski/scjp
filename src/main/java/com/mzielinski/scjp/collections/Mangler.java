package com.mzielinski.scjp.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzielinski, Rule Financial
 */
public class Mangler {

    public static <K, V> Map<K, V>  mangle(Map<K, V> in) {
        Map out = new HashMap();
        for (Map.Entry entry : in.entrySet()) {
            out.put(entry.getValue(), entry.getKey());
        }
        return out;
    }

    public static void main(String... args) {
        Map m1 = new HashMap();
        m1.put("a", 1);
        m1.put("b", 2);
        Map m2 = mangle(m1);
        System.out.println(m2.get("a") + " " + m2.get("2"));
    }
}
