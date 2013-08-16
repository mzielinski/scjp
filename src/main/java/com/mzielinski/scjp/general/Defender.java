package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Alien {

    String invade(int ships) {
        return "a few";
    }

    String invade(int... ships) {
        return "many";
    }
}

public class Defender {

    public static void main(String... args) {
        System.out.println(new Alien().invade(1));
        System.out.println(new Alien().invade(1,2));
    }

}
