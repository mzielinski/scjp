package com.mzielinski.scjp.collections;

/**
 * @author mzielinski, Rule Financial
 */

import java.util.*;

interface Canine {
}

class Dog implements Canine {
}

public class Collie extends Dog {
    public static void main(String[] args) {
        List<Canine> o = new ArrayList<Canine>();
        List<Dog> d = new ArrayList<Dog>();
        List<Collie> c = new ArrayList<Collie>();
        d.add(new Collie());
        c.add(new Collie());
        do1(o);
        do1(d);
//        do1(c);
        do2(o);
        do2(d);
        do2(c);
    }

    static void do1(List<? super Dog> d2) {
        d2.add(new Collie());
        System.out.println(d2.size());
    }

    static void do2(List<? extends Canine> c2) {
    }
}
