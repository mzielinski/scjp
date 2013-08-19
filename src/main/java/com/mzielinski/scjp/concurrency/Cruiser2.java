package com.mzielinski.scjp.concurrecy;

/**
 * User: mzielinski
 * Date: 8/15/13 8:55 PM
 */
public class Cruiser2 implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser2());
        a.start();

        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }

    public void run() {
        System.out.print("Run");
    }

}
