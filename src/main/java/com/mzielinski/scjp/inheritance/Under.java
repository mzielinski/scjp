package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class Upper {
    String go() {
        return "hi";
    }
}

class Mid extends Upper {
}

public class Under extends Mid {
    static String s = "-";

    public static void main(String[] args) {
        Upper u = new Under();
        s = u.go();
        Mid m = (Mid) u;
        System.out.println(s += m.go());
    }
}
