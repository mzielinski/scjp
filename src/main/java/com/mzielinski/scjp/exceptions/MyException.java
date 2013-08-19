package com.mzielinski.scjp.exceptions;

/**
 * User: mzielinski
 * Date: 8/12/13 10:33 PM
 */
class MyException extends Exception {
}

class Test {
    void f() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e1 = null;
        Test t = new Test();
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
}
