package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 */
class Base
{
    Base(int i)
    {
        System.out.println("Base");
    }
}
public class Derived extends Base {

    Derived() { // I need to add constructor with int parameter
        super(1);
    }

    public static void main(String[] args)
    {
        Derived d = new Derived();

        for (int k=1; k<10; k++) {
            if (k % 2 == 1)
                continue;
            System.out.println("Test");
        }
    }

    void Derived()
    {
        System.out.println("Derived");
    }


}