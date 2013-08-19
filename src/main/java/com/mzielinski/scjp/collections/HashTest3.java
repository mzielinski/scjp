package com.mzielinski.scjp.collections;

import java.util.Arrays;
import java.util.Collections;

/**
 * User: mzielinski
 * Date: 8/15/13 8:43 PM
 */
public class HashTest3 {

    private String str;

    public HashTest3(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String args[]) {
        HashTest3 h1 = new HashTest3("2");
        String s1 = new String("1");

        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;

        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}