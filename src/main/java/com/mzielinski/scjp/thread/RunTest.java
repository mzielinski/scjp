package com.mzielinski.scjp.thread;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class RunTest implements Runnable {

    public static void main(String[] args) {
        RunTest rt = new RunTest();
        Thread t = new Thread(rt);
        rt.run();
    }

    public void run() {
        System.out.println("running");
    }

    void go() {
        start(1);
    }

    void start(int i) {
        System.out.println("start: " + i);
    }

}
