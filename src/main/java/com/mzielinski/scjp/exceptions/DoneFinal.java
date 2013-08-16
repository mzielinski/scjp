package com.mzielinski.scjp.exceptions;

/**
 * @author mzielinski, Rule Financial
 */
public class DoneFinal {

    public static void main(String[] args) {
        try {
            if (args.length == 0) throw new Exception();
        } catch (Exception e) {
            System.out.print("done ");
            doStuff(); // assume this method compiles
        } finally {
            System.out.println("finally ");
        }
    }

    private static void doStuff() {
        System.exit(1);
    }

}
