package com.mzielinski.scjp.concurrecy;

/**
 * User: mzielinski
 * Date: 8/12/13 10:44 PM
 */
public class TestThread2 extends Thread {
    static String s = new String("hi");

    public void run() {
        try {
            synchronized (s) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");
        t1.start();
        t2.start();
    }
}