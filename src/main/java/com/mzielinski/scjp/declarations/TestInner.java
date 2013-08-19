package com.mzielinski.scjp.declaration;

/**
 * User: mzielinski
 * Date: 7/31/13 9:35 PM
 */
public class TestInner {

    static int i = 10; //1

    TestInner() {
        System.out.print("Outer");   //2
    }

    static class MyInner {
        MyInner() {
            System.out.println(i);    //3
        }
    }

    public static void main(String[] args) {  // 4
        new TestInner.MyInner();   //5
    }
}
