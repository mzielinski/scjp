package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
public class Primitives {

    public static void main(String[] args) {
        boolean[] ba = {true, false};
        short[][] gr = {{1, 2}, {3, 4}};
        int i = 0;
        for (; i < 10; ) i++;
        for (short[] s : gr) ;
        for (int j = 0, k = 10; k > j; ++j, k--) ;
        for (int j = 0; j < 3; System.out.println(j++)) ;
        for (Boolean b : ba) ;
    }
}
