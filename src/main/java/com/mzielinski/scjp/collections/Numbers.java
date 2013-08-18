package com.mzielinski.scjp.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author mzielinski, Rule Financial
 */
public class Numbers {

    private Set<Integer> numbers = new TreeSet<Integer>();

    public Numbers(int... numbers) {
        for (int n : numbers) {
            this.numbers.add(n);
        }
    }

    public Numbers negate() {
        Numbers negatives = new Numbers();
        for (int n : numbers) {
            negatives.numbers.add(-n);
        }
        return negatives;
    }

    public void show() {
        for (int i : numbers) {
            System.out.print(" " + i);
        }
    }

    public static void main(String[] args) {
        new Numbers(1, 3, -5).negate().show();
    }
}
