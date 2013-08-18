package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 *         Which method declarations, when inserted independently at the indicated position,
 *         will not cause the program to fail during compilation?
 */
public class Test3 {

    public long sum(long a, long b) {
        return a + b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

//    public int sum(long a, long b) {
//        return a + b;
//    }

//    abstract int sum();
//
//    private static long sum(long a, long b) {
//        return a + b;
//    }

    public long sum(long a, int b) {
        return a + b;
    }

}
