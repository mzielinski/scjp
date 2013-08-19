package com.mzielinski.scjp.fruits.package2;

import com.mzielinski.scjp.fruits.package1.Fruit;

/**
 * User: mzielinski
 * Date: 8/12/13 11:01 PM
 */

public class Apple {
    int a = 10;

    public void doStuff(int a) {
        a += 1;
        System.out.println(a++);
        System.out.println(a);
    }
    public static void main(String args[]) {
        Apple t = new Apple();
        t.doStuff(3);
    }
}

//public class Apple extends Fruit {
//
//    {
//        teste = "sweet";
//    }
//
//    protected void changeColor() throws RuntimeException {
//    }
//
//    void changeColor(){}
//
//}
