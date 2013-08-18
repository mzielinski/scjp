package com.mzielinski.scjp.thread;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class ThreadTest implements Runnable {

    private Integer x = 0;

    public int getData() {
        synchronized (x) {
            x = 123;
            x += 12;
        }
        return x;
    }

    public void run() {
        System.out.println(getData() + " ");
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread th1 = new Thread(test);
        Thread th2 = new Thread(test);
        th1.start();
        th2.start();
    }
}