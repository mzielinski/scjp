package com.mzielinski.scjp.generics;

/**
 * @author mzielinski, Rule Financial
 */
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Mixer<A extends Animal> {
    public <C extends Cat> Mixer<? super Dog> useMe(A a, C c) {
        return null;
//        return new Mixer<Dog>();
//        return new Mixer<Animal>();
//        return new Mixer<A>();
//        return new Mixer<a>();
//        return new Mixer<c>();
    }
}
