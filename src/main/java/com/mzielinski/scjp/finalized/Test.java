package com.mzielinski.scjp.finalized;

/**
 * @author mzielinski, Rule Financial
 */
class SuperTest {
    protected void finalize() throws Throwable {
        super.finalize();			// 1
        System.out.println("SuperTest");
    }
}

public class Test extends SuperTest {
    String s = "abc";

    public static void main(String[] args) throws Throwable {
        Test t = new Test();		// 2
        t.finalize();				// 3
    }
}