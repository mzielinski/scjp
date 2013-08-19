package com.mzielinski.scjp.exceptions;

/**
 * User: mzielinski
 * Date: 8/12/13 10:33 PM
 */

public class MyExceptionTest {

    private class MyException extends Exception {
    }

    void f() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e1 = null;
        MyExceptionTest t = new MyExceptionTest();
        try {
            t.f();
        } catch (MyException e) {
            e1 = e;
            System.out.println("catch");
        } finally {
            System.out.print("finally");
            throw e1;
        }
//        System.out.println("end");
    }

    public static void main2(String[] args) throws MyException {
        MyException e1 = null; // in test without initialization
        MyExceptionTest t = new MyExceptionTest();
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
