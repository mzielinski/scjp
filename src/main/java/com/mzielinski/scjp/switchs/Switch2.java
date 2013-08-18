package com.mzielinski.scjp.switchs;

/**
 * @author mzielinski, Rule Financial
 */
public class Switch2 {

    public final static short x = 1;
    static final int y = 3;

    public static void main(String[] args) {
        for (int z = 3; z > 0; z--) {
            switch (z) {
                case y:
                    System.out.println("0");
                case y-1:
                    System.out.println("1");
                case x: z--;
            }
        }
    }
}
