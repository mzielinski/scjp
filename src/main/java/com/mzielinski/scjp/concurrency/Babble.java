package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */
public class Babble {

    private static synchronized void say(String s) {
        System.out.print(s);
    }

    public static void main(String... args) {
        Thread letters = new Thread() {
            @Override
            public void run() {
                say("a");
                say("b");
                say("c");
            }
        };
        Thread numbers = new Thread() {
            @Override
            public void run() {
                say("1");
                say("2");
                say("3");
            }
        };
        letters.start();
        numbers.start();
    }
}
