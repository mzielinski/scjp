package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class AA {
    String s = "-";
    AA() {
        this("d");
        s += "a";
    }

    public AA(String e) {
        s += "d";
    }
}

class BB extends AA {
    BB() {
        super();
        s += "b";
    }
}
class CC extends BB {
    CC() {
        s += "c";
    }

    public static void main(String... arg) {
        System.out.println(new CC().s);
    }
}
