package com.mzielinski.scjp.concurrency;

/**
 * User: mzielinski
 * Date: 8/12/13 10:12 PM
 */
class TestThread extends Thread {
    private int i;
    static String s = new String("hi");

    TestThread(String s) {
        super(s);
    }

    public String getObj() {
        return s;
    }

    public void run() {
        try {
            synchronized (this.getObj()) {
                System.out.println(
                        Thread.currentThread().getName()
                );
                Thread.sleep(1000);
                System.out.println(
                        Thread.currentThread().getName()
                );
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