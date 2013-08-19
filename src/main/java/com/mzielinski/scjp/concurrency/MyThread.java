package com.mzielinski.scjp.concurrecy;

/**
 * User: mzielinski
 * Date: 8/12/13 10:43 PM
 */
class MyThread extends Thread {
    String sa;

    public MyThread(String sa) {
        this.sa = sa;
    }

    public void run() {
        synchronized (sa) {
            while (!sa.equals("Done")) {
                try {
                    sa.wait();
                } catch (InterruptedException ie) {
                }
            }
        }
        System.out.println(sa);
    }
}

class Test {
    private static String sa = new String("Not Done");

    public static void main(String[] args) {
        Thread t1 = new MyThread(sa);
        t1.start();
        synchronized (sa) {
            sa = new String("Done");
            sa.notify();
        }
    }
}
