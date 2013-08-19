package com.mzielinski.scjp.declaration;

/**
 * User: mzielinski
 * Date: 7/31/13 9:28 PM
 */

class AA {

    int i;

    AA() {
        System.out.println("AA()");
    }
}

class BB extends AA {
    BB(short i) {
        this.i = i;
        System.out.println("short");
    }

    BB(float j) {
        i = (short) j;
        System.out.print("float");
    }
}

public class Test extends BB {

    Test() {
        super(4);
    }

    public static void main(String[] args) {
        System.out.print(new Test().i); //line 1
    }
}
