package com.mzielinski.scjp.old;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {

    public void Test() {
        System.out.println("no-arg");
    }

    public void Test(int x) {
        System.out.println(x);
    }

    public void Test(long x) {
        System.out.println(x);
    }

    public static void main(String... args) {
        new Test();
        System.out.println(new Runnable() {public void run() {}});
    }

    public static <T> List<T> backwards(List<T> input) { // OK
//    public static <T> List<T> backwards(List<? extends T> input) { // OK
//    public static <T> List<T> backwards(List<? super T> input) { // Error
//    public static <T> List<? extends T> backwards(List<T> input) { // OK
//    public static <T> List<? super T> backwards(List<T> input) { // OK
//    public static <? extends T> List<T> backwards(List<T> input) { // Error
//    public static <? super T> List<T> backwards(List<T> input) { // Error
        List<T> output = new LinkedList<T>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }


}
