package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("a");
        for (int i = 1; i < 5; i++)
            result.append("a");
        result.insert(4, "123");
        System.out.println(result);
    }
}