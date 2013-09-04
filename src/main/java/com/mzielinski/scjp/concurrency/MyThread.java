package com.mzielinski.scjp.concurrency;

/**
 * User: mzielinski
 * Date: 8/12/13 10:43 PM
 */
public class MyThread extends Thread {

    private String sa = "Not Done";

    public void run() {
        synchronized (MyThread.class) {
            while (!"Done".equals(sa)) {
                try {
                    MyThread.class.wait();
                } catch (InterruptedException ignored) {}
            }
        }
        System.out.println(sa);
    }

    void setSa(String sa) {
        this.sa = sa;
    }
}

class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(2000);
        synchronized (MyThread.class) {
            t1.setSa("Done");
            MyThread.class.notify();
        }
    }
}
