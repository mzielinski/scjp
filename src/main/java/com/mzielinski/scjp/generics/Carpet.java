package com.mzielinski.scjp.generics;

/**
 * @author mzielinski, Rule Financial
 */

class A {}
class B extends A {}
class C extends B {}

public class Carpet<V extends B> {
    public <X extends V> Carpet<? extends V> method(Carpet<? super X> e) {
//        return new Carpet<X>();
        return new Carpet<V>();
//        return new Carpet<A>(); error
//        return new Carpet<B>(); error
//        return new Carpet<C>();
    }

    public static void main(String... args) {
        Carpet<B> carpet = new Carpet<B>();
        System.out.println(carpet.method(new Carpet<C>()));
    }

//    a, b The generic declaration at the class level says that Carpet can
//    accept any type which is either B or a subtype of B. The generic declaration at the method
//    level is "<X extends V>", which means that X is a type of V or a subtype of V, where
//    the class type of V can vary at runtime—hence, the exact scopes of X and V are unknown
//    at compile time. A and B are correct because X and V bind to the scope of <? extends
//            V>, where X is known as a subtype of V as it’s declared at the method level

//    c, d, and e are incorrect because it’s illegal to use a concrete class type since the exact
//            scope of V is unknown.
}
