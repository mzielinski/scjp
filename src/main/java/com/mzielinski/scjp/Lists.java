package com.mzielinski.scjp;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */

interface A {
}

class B implements A {
}

class C extends B {
}

public class Lists {

    private List<A> aList = new LinkedList<A>();
    private List<B> bList = new LinkedList<B>();
    private List<C> cList = new LinkedList<C>();
    private List<Object> otherList = new LinkedList<Object>();

    public void add(Object o) {
        if (o instanceof C) {
            cList.add((C) o);
        } else if (o instanceof B) {
            bList.add((B) o);
        } else if (o instanceof A) {
            aList.add((A) o);
        } else {
            otherList.add(o);
        }
    }

    public static void main(String... args) {
        Lists lists = new Lists();
        lists.add(new A() {});
        lists.add(new B());
        lists.add(new C());
        lists.add(new Object());
        System.out.println(lists.aList.size() + " " + lists.bList.size() +  " " + lists.cList.size() + " " + lists.otherList.size());
    }

}
