package com.mzielinski.scjp.exceptions;

/**
 * @author mzielinski, Rule Financial
 */
class MyException extends RuntimeException {
}

public class Houdini {
    public static void main(String[] args) throws Exception {
        throw new MyException();
//        System.out.println("success");
    }
}
