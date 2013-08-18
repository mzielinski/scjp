package com.mzielinski.scjp.old.package7;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {
    public abstract class InnerTest {
        abstract int f(int b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test.InnerTest test = t.new InnerTest() {
            public int f(int b) {
                return b;
            }
        };
    }
}