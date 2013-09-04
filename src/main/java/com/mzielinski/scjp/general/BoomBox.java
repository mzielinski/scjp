package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Stereo {
    void makeNoise() {
        assert false;
    }
}

public class BoomBox extends Stereo {

    public static void main(String[] args) {
        new BoomBox().go(args);
    }

    void go(String[] args) {
        if (args.length > 0) makeNoise();
        if (!args[0].equals("x")) System.out.println("!x");
    }
}
