package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */
public class ThreadTest extends Thread {

    public static void main(String[] args) {
        new ThreadTest().start();
    }

    class InnerRun implements Runnable {

        @Override
        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ren ");
        }
    }

    class InnerRun2 implements  Runnable {

        private Thread other;

        InnerRun2(Thread other) {
            this.other = other;
        }

        @Override
        public void run() {
            try {
                other.join();
                System.out.println("Stimpy ");
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

    }

    @Override
    public void run() {
        Thread thread1 = new Thread(new InnerRun());
        Thread thread2 = new Thread(new InnerRun2(thread1));
        thread2.start();
        thread1.start();
    }
}
