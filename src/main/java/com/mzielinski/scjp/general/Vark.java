package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Alpha {
    int doStuff(float b) {
        return 7;
    }
}
public class Vark extends Alpha{

    @Override
    protected final int doStuff(float b) {
        return super.doStuff(b);
    }

    public static void main(String... args) {
        new Vark().go(args, 42);
    }

    private void go(String[] args, int i) {
        System.out.println(args[1]);
    }

    public <S extends CharSequence> S foo(S s) {
//        return (S) new StringBuilder(s);
//        return s;
        return null;
    }
}
