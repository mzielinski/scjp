package com.mzielinski.scjp.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */
enum A {
    A
}

public class BackLister {

    public static <T> List<T> backwards(List<T> input) {
//    public static <T> List<T> backwards(List<? extends T> input) {
//    public static <T> List<T> backwards(List<? super T> input) {
//    public static <T> List<? extends T> backwards(List<T> input) {
//    public static <T> List<? super T> backwards(List<T> input) {
//    public static <? super T> List<T> backwards(List<T> input) {
//    public static <? extends T> List<T> backwards(List<T> input) {
        List<T> output = new LinkedList<T>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }

    public static void main(String... args) {
        System.out.println(A.A.ordinal());
    }

}
