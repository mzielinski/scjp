package com.mzielinski.scjp.exceptions;

/**
 * User: mzielinski
 * Date: 8/12/13 10:35 PM
 */
public class Test2 {

    void f() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e1 = null; // in test without initialization
        Test t = new Test();
        try {
            t.f();
        } catch (MyException e) {
            e1 = e;
            System.out.print("catch 1 ");
        } finally {
            try {
                throw e1;
            } catch (Exception e) {
                System.out.println("catch 2 ");
            }
        }
        System.out.println("end");
    }
}
