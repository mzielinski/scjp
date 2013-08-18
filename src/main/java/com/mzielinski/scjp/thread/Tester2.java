package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */
public class Tester2 {

    private static final class Lock {}

    private static final Object lock = new Lock();

    private static class Thread1 implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }

    }

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
            synchronized (lock) {
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }

}
