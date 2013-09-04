package com.mzielinski.scjp.old.concurrecy;

/**
 * @author mzielinski, Rule Financial
 */
public class OrderedThread {

    public static void main(String[] args) {
        MBThread first, second, third;
        OrderedThread orderedThread = new OrderedThread();
        first = new MBThread("One", orderedThread);
        second = new MBThread("Two", orderedThread);
        third = new MBThread("Three", orderedThread);
        second.start();
        first.start();
        third.start();
    }

    public void display(String msg) {
        synchronized (msg) {
            for (int i = 0; i < 20; i++) {
                System.out.println(msg);
            }
        }
    }
}

class MBThread extends Thread {
    String name;
    OrderedThread orderT;

    MBThread(String name, OrderedThread orderT) {
        this.name = name;
        this.orderT = orderT;
    }

    public void run() {
        orderT.display(name);
    }
}