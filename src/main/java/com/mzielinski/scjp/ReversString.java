package com.mzielinski.scjp;

/**
 * @author mzielinski, Rule Financial
 */
public class ReversString {

    public static void main(String... args) {
        byte[] array = "algorithm".getBytes();
        for (int i = 0; i <  array.length / 2; i++) {
            array[i] = (byte) (array[i] ^ array[ array.length - i - 1]);
            array[ array.length - i - 1] = (byte) (array[i] ^ array[ array.length - i - 1]);
            array[i] = (byte) (array[i] ^ array[ array.length - i - 1]);
        }
        for (byte b : array) {
            System.out.print((char) b);
        }
    }

}
