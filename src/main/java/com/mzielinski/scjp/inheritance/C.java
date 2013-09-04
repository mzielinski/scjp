package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */
class A {

    void getMe() throws Exception {
    }

    class A1 {
        void printValue() {
            System.out.println("A.A1");
        }
    }

}

class B extends A{
    public void printName(){
        System.out.println("Name-C");
    }
}

public class C extends A {

    @Override
    protected void getMe() {
    }

    public static void main(String[] args) {
        byte b = 113;
        b += 8;
        System.out.println(b);
        b = (byte) (b + 7);
        System.out.println(b);

        C bObject = new C(); // if object will be A type, Exception has to be handled
        bObject.getMe();

        // -----------------------------

        for (int i = 2; i < 4; i++) {
            for (int j = 2; j < 4; j++) {
                if (i < j) {
                    assert i > j : i;
                }
            }
        }

        // -----------------------------

        A a = new A();
        // A.A1 a1 = new A.A1(); //  only for static
        A.A1 a1 = a.new A1();


        // -----------------------------

        A a2 = new C();
        B b2 = new B();
        C c2 = new C();
//        b2 = c2; // error
    }

}
