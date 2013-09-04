package com.mzielinski.scjp.concurrency;

/**
 * User: mzielinski
 * Date: 8/12/13 10:44 PM
 */
public class TestThread2 extends Thread {
    static String s = "hi";

    public TestThread2(String name) {
        super(name);
    }

    public void run() {
        try {
            synchronized (s) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException ignored) {
        }
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("A");
        TestThread2 t2 = new TestThread2("B");
        t1.start();
        t2.start();
    }
}