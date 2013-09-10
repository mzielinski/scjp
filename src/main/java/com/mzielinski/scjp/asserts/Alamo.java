package com.mzielinski.scjp.asserts;

/**
 * @author mzielinski, Rule Financial
 */
public class Alamo {
    public static void main(String[] args) {
        try {
            assert (!args[0].equals("x")) : "kate";
        } catch (Error e) {
            System.out.print("ae ");
        } finally {
            try {
                assert (!args[0].equals("y")) : "jane";
            } catch (Exception e2) {
                System.out.print("ae2 ");
            } finally {
                throw new IllegalArgumentException();
            }
        }
    }
}
