package com.mzielinski.scjp.exam3;

import java.util.concurrent.CountDownLatch;

/**
 * @author mzielinski, Rule Financial
 */

class StopLatchedThread extends Thread {

    private final CountDownLatch stopLatch;

    public StopLatchedThread(CountDownLatch stopLatch) {
        this.stopLatch = stopLatch;
    }

    public void run() {
        try {
            for (int i = 0; i < 500; i++) {
                if (i == 250)
                    try {
                        System.out.println("**" + Thread.currentThread().getId() + "**");
                        Thread.sleep(600);
                    } catch (Exception ignored) {
                    }
            }
        } finally {
            stopLatch.countDown();
        }
    }
}

public class BangCountDownLatch extends Thread {

    public static void main(String[] args) throws Exception {
        long start = System.nanoTime();
        int size = 3;
        CountDownLatch cdl = new CountDownLatch(size);
        for (int i = 0; i < size; i++) {
            Thread t = new StopLatchedThread(cdl);
            t.start();
        }
        cdl.await();
        System.out.println("time: " + (System.nanoTime() - start));
    }

}

