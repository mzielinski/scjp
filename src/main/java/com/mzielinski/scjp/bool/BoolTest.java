package com.mzielinski.scjp.bool;

/**
 * @author mzielinski, Rule Financial
 */
public class BoolTest {

    public static void main(String[] args) {
        Boolean b = new Boolean("TRue");
        Boolean c = new Boolean("Null");
        boolean d = true;
        Boolean e = (b || c) && d;
        System.out.println(e);

    }

}
