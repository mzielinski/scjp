package com.mzielinski.scjp.autoboxing;

/**
 * @author mzielinski, Rule Financial
 */
public class Stealth {

    public static void main(String[] args) {
//        example1();
        example2();
    }

    private static void example1() {
        Integer i = 420;
        Integer i2;
        Integer i3;
        i2 = i.intValue();
        i3 = i.valueOf(420);
        System.out.println((i == i2) + " " + (i == i3));
    }

    private static void example2() {
        Integer i1 = 2001; // set 1
        Integer i2 = 2001;
        System.out.println((i1 == i2) + " " + i1.equals(i2)); // output 1
        Integer i3 = 21; // set 2
        Integer i4 = new Integer(21);
        System.out.println((i3 == i4) + " " + i3.equals(i4)); // output 2
        Integer i5 = 127; // set 3
        Integer i6 = 127;
        System.out.println((i5 == i6) + " " + i5.equals(i6)); // output 3
        Integer i7 = -129; // set 3
        Integer i8 = -129;
        System.out.println((i7 == i8) + " " + i7.equals(i8)); // output 4
        Integer i9 = Integer.valueOf(21);
        Integer i10 = Integer.valueOf(21);
        System.out.println((i9 == i10) + " " + i9.equals(i10)); // output 2
    }

}
