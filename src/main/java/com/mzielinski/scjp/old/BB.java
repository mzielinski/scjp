package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 */

class AA {
    int increment(int x) {
        return x + 10;
    }
//
//    long increment(int x) {
//        return x + 20;
//    }
}

public class BB extends AA {

    public static void main(String[] args) {
        BB b = new BB();
        int y = b.increment(12);

        System.out.printf("1: [%d], 2: [%d]", b.arr.length, b.arr[1][0].length);
    }

    String[][][] arr = {
            { {}, null},
            { { "1", "2"}, {"1", null, "3"}},
            {},
            { {"1", null} }
    };

}
