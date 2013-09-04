package com.mzielinski.scjp.exam3;

/**
 * @author mzielinski, Rule Financial
 */
public class Volume {

    private Volume v;
    private int size;

    public static void main(String[] args) {
        Volume myV = new Volume();
        final Volume v2;
        System.out.println(myV);
        v2 = myV.doStuff(myV);
        v2.v.size = 7;
        System.out.print(v2.size);
        System.out.print(v2.v.size);
    }

    Volume doStuff(Volume v3) {
        v3.size = 5;
        v3.v = new Volume();
        v3.v.size = v3.size;
        return v3;
    }

}
