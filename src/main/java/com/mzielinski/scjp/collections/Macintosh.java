package com.mzielinski.scjp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */
class Apple implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class Macintosh extends Apple {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<Apple>();
        basket(list);
        Collections.sort(list);
        System.out.println(list.size());
    }

//    private static void basket(List<Apple> list) {
//        // list.add(new Object()); // error
//        list.add(new Apple());
//        list.add(new Macintosh());
//    }
//
    private static void basket(List<? super Apple> a) {
//        a.add(new Object()); // error
        a.add(new Apple());
        a.add(new Macintosh());
    }

//    private static void basket(List<?> list) {
//        System.out.println(list.size());
//        // list.add(new Object()); // error
//    }

}
