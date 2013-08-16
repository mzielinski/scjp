package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */
class TestThread extends Thread {

    final static String s = "hi";

    public TestThread(String threadName) {
        super(threadName);
    }

    public void run() {
        try
        {
            synchronized (s)
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        }
        catch (InterruptedException ignored)
        {}
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");
        t1.start();
        t2.start();
    }
}
