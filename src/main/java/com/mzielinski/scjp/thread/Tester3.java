package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */
public class Tester3 extends Thread {

    @Override
    public void run() {
        System.out.print("run");
    }

    public static void main(String[] args) {
        Tester3 thread = new Tester3();
        new Thread(thread).start();
        new Thread(thread).start();
    }
}
