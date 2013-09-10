package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Engine {
    public class Piston {

        // static
        int count = 0;

        void go() {
            System.out.print(" pump " + ++count);
        }
    }

    public Piston getPiston() {
        return new Piston();
    }
}

public class Auto {
    public static void main(String[] args) {
        Engine e = new Engine();
        Engine.Piston p = e.getPiston();
//        e.getPiston();
        p.go();
        p.go();
    }
}