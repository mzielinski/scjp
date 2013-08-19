package com.mzielinski.scjp.generics;

/**
 * User: mzielinski
 * Date: 8/13/13 8:16 PM
 */
public class TrickyNum<X extends Object> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private double getDouble() {
        return  ((Double) x).doubleValue(); //x.doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}
