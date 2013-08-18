package com.mzielinski.scjp.general;

import static java.lang.System.*;

/**
 * @author mzielinski, Rule Financial
 */
public class _ {

    static public void main(String... ___A_V_) {
        String $ = "";
        for (int i = 0; ++i < ___A_V_.length; ){
            $ += ___A_V_[i];
        }
        out.println($);

        int x = 1;
        if ((4 > x) ^ ((++x + 2) > 3)) x+=10;
        if ((4 > ++x) ^ !(++x == 5)) x+=100;
        out.println(x);

        short[][] b = new short[4][4];
        short[][] big = new short[2][2];
        short b3 = 8;
        short[][][][] b2 = new short[2][3][2][2];

        b2[1][1] = big;
        b[1][0] = b3;
//        b2[0][1][1] = b;
//        b2[0][2][1] = b[1][0];
        b2[1][1][0][1] = b[1][0];
        b2[1][1] = b;

        int k = 2;
        outer:
         while (true) {
             ++k;
             inner:
             for (int j = 6; j > 2; j--) {
                 k = 8 - j;
                 if (j == 3) {
                     continue inner;
                 }
                 break outer;
             }
             continue outer;
         }
        out.println(k);
    }
}
