package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
public class Kant extends Philosopher {

    Kant() {
        this("Bart");
    }

    Kant(String s) {
        super(s);
    }

//    Kant() { super("Bart"); }
//    Kant(String s) { super(s); }

//    Kant() { super(); }
//    Kant(String s) { super(s); }

//    Kant() { super("Bart"); }
//    Kant(String s) { this(); }

//    Kant() { super("Bart"); }
//    Kant(String s) { this("Homer"); }

    public static void main(String[] args) {
        new Kant("Homer");
        new Kant();
    }
}

class Philosopher {
    Philosopher(String s) {
        System.out.print(s + " ");
    }
}