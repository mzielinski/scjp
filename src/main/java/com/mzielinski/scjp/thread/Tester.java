package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */
public class Tester extends Thread {

    int code = 9;

    @Override
    public void run() {
        this.code = 7;
    }

    public static void main(String[] args) {
        Tester thread = new Tester();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.print(thread.code);
        }
    }

}
