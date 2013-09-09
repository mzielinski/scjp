package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
public class Ice {

    private static int count = 0;

    private Long[] stockings = {3L, 4L, 5L};

    public static void main(String[] args) {
        new Ice().go();
        System.out.println(count);
    }

    void go() {
        for (short x = 0; x < 5; x++) {
            if (x == 2) return;
            for (long ell : stockings) {
                count++;
                if (ell == 4) break;
            }
        }
    }

}
