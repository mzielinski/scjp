package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */
public class Tester4 extends Thread {

    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        Thread thread = new Tester3();
        thread.run();
        thread.start();
        thread.start();
    }
}
