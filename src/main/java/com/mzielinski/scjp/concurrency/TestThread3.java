package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */
public class TestThread3 extends Thread {

    public void restart() {
        startMe(this);
    }

    public static void startMe(TestThread3 testThread3) {
        synchronized (testThread3) {
            testThread3.notifyAll();
            System.out.println("Trying to notify");
        }
    }

    public void run() {
        try {
            synchronized (this) {
                wait();
                System.out.println("Notified");
            }
        } catch (InterruptedException ignored) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread3 t1 = new TestThread3();
        t1.start();
        Thread.sleep(1000);
        t1.restart();
    }
}
