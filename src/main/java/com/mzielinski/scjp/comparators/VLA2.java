package com.mzielinski.scjp.comparators;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mzielinski, Rule Financial
 */
public class VLA2 implements Comparator<VLA2> {

    int dishSize;

    VLA2(int d) {
        dishSize = d;
    }

    public static void main(String[] args) {
        //  200, 90, 60, 40
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60), new VLA2(90)};
        Arrays.sort(va, va[0]);
        int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.print(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), va[0]);
        System.out.print(index);
    }

    @Override
    public int compare(VLA2 a, VLA2 b) {
        return a.dishSize - b.dishSize;
    }
}