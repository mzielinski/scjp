package com.mzielinski.scjp.collections;

import java.util.HashSet;

/**
 * User: mzielinski
 * Date: 8/15/13 8:37 PM
 */
public class HashTest2 {

    private String str;

    public HashTest2(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public int hashCode() {
        return this.str.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HashTest2) {
            HashTest2 ht = (HashTest2) obj;
            return this.str.equals(ht.str);
        }
        return false;
    }

    public static void main(String args[]) {
        HashTest2 h1 = new HashTest2("1");
        HashTest2 h2 = new HashTest2("1");
        String s1 = new String("2");
        String s2 = new String("2");

        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
        hs.add(s1);
        hs.add(s2);

        System.out.print(hs.size());
    }

}
