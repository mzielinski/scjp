package com.mzielinski.scjp.inheritance;

import static com.mzielinski.scjp.inheritance.package1.Stuff.*;

/**
 * @author mzielinski, Rule Financial
 */
public class User {

    public static void main(String[] args) {
        new User().go();
    }

    private void go() {
        System.out.println(doStuff(MY_CONST));
        System.out.println(MY_CONST);
    }

}
