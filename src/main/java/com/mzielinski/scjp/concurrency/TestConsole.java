package com.mzielinski.scjp.concurrency;

import java.io.Console;

/**
 * @author mzielinski, Rule Financial
 */
public class TestConsole implements Runnable{

    @Override
    public void run() {
        Console c = System.console();
        String u = c.readLine("%s", "t ");
        System.out.println(c + " ");
    }

    public static void main(String[] args) {
        new Thread(new TestConsole()).start();
        new Thread(new TestConsole()).start();
        Console c = System.console();
        String u = c.readLine("%s", "m ");
        System.out.println(u + " ");
    }

}
