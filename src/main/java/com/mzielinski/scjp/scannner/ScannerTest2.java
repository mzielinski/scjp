package com.mzielinski.scjp.scannner;

import java.util.Scanner;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class ScannerTest2 {

    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
    }

    private static void example1() {
        String input = "10 apples 20 oranges 33 pears";
        Scanner s = new Scanner(input).useDelimiter("\\d*");
        String str[] = new String[60];
        int i = 0;
        while (s.hasNext()) {
            str[i] = s.next();
            System.out.println(str[i++]);
        }
        s.close();
    }

    private static void example2() {
        String in = "1234,32177,689";
        Scanner sc = new Scanner(in);
        sc.useDelimiter(",");
//        while (sc.hasNext())
//            System.out.print(sc.nextInt() + " ");
        while (sc.hasNext())
            System.out.print(sc.nextShort() + " ");
    }

    private static void example3() {
        String s = "123 888888 x 345 -45";
        Scanner sc = new Scanner(s);
        while (sc.hasNext())
            if (sc.hasNextShort())
                System.out.print(sc.nextShort() + " ");
            else if (sc.hasNext()) {
                sc.next();
            }
    }

}
