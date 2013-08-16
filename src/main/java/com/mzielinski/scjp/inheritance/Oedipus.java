package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class Father {
    protected Father() {
        System.out.println("Father");
    }
}
public class Oedipus extends Father {

    private Oedipus() {
        System.out.println("Oedipus");
    }

    public static void main(String... args) {
        new Oedipus();
    }

}
