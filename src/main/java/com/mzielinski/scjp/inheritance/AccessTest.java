package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
abstract class Test {
    void test() {
        System.out.println("Super");
    }
}

class SubTest extends Test {
    protected void test() {
        System.out.println("Sub");
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test t = new SubTest();
        t.test();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
