package pl.mzielinski.scjp.stringbuff;

import java.util.Scanner;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {

        public static void main(String[] args) {
//        StringBuffer s = new StringBuffer("hello");
//        String s1 = null;
//        s.append(s1);
//        System.out.println(s);

        String s = "howzzat";
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("wz");
        scanner.next();
        System.out.println(scanner.next());
    }

}
