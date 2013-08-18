package com.mzielinski.scjp.old;

/**
 * What happens when you try to compile and run the following program?
 *
 * @author Maciej Zielinski, Rule Financial
 */
public class Mystery {

    String s;

    public static void main(String[] args) {
        Mystery m = new Mystery();
        m.go();
    }

    void Mystery() {
        s = "Constructor";
    }

    void go() {
        System.out.println(s);
    }
}