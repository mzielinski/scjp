package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */
public class TestRunnable {

    public static void main(String... args) {
        Runnable x = new Runnable() {
            @Override
            public void run() {
                System.out.printf("run %s", Thread.currentThread().getName());
            }
        };
        new Thread(x).start();
        System.out.println(Thread.currentThread().getName());
    }
}
