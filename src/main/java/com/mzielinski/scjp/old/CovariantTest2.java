package com.mzielinski.scjp.old;

/**
 * @author mzielinski, Rule Financial
 */
interface Inter {
}

class First implements Inter {
    public Inter method1() {
        System.out.println("super");
        return new First();
    }
}

class Second extends First {
    public First method1() {
        System.out.println("sub");
        return new Second();
    }
}

public class CovariantTest2 {
    public static void main(String[] args) {
        First first = new Second();
        Inter first1 = first.method1();
    }
}
