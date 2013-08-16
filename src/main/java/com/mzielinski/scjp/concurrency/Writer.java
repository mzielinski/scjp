package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */
public class Writer extends Thread {

    public void run() {

        System.out.println("Writer run");

    }

    public static void main(String[] args) {

        Runnable c = new Writer();

        Thread t = new Thread(c);

        t.run();

    }

}