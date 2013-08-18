package com.mzielinski.scjp.generics;

/**
 * @author mzielinski, Rule Financial
 */
class Food {}
class Fruit extends Food {}
class Apple extends Fruit {}

public class Pie<T extends Fruit> {

    public static void main(String... args) {
        Pie<Fruit> p = new Pie<Fruit>();
    }

}
