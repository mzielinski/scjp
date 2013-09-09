package com.mzielinski.scjp.generics;

/**
 * @author mzielinski, Rule Financial
 */
public class Hose<E extends Hose> {

    E innerE;

    public E doStuff(E e, Hose<E> e2) {
        // insert code here
        return e;
//        return e.getE();
//        return e2;
//        return e2.getE();
//        return new Hose().getE();
    }

    public E getE() {
        return innerE;
    }

}
