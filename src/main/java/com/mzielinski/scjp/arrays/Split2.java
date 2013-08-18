package com.mzielinski.scjp.arrays;

import java.util.Arrays;

/**
 * @author mzielinski, Rule Financial
 */
public class Split2 {

    public static void main(String[] args) {
        String str = "She sells sea shells";
        System.out.println(Arrays.toString(str.split("\\s")));
    }

}
