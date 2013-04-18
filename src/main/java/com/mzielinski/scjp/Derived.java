package com.mzielinski.scjp;

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
public class Derived extends Base
{
    Derived() {
        super(10);
    }

    public static void main(String[] args)
    {
        Derived d = new Derived();
    }

    void Derived()
    {
        System.out.println("Derived");
    }
}