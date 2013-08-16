package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class AlternateFuel {
    int getRating() {
        return 42;
    }
    static int getRating2() {
        return 43;
    }
}
public class BioDiesel extends AlternateFuel {

    public static void main(String... args) {
        new BioDiesel().go();
//        System.out.println(super.getRating());
    }

    private void go() {
        System.out.println(super.getRating());
    }
}
