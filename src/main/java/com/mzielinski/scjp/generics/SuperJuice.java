package com.mzielinski.scjp.generics;

import java.util.Random;

/**
 * @author mzielinski, Rule Financial
 */
public class SuperJuice {

    public int calculateJuice(int seed) {
        return seed * ((int) new Random().nextDouble()) * 1024;
    }

    public static void main(String[] args) {
        System.out.println(new SuperJuice().calculateJuice(99));
    }
}
