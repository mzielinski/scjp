package pl.mzielinski.scjp.scannner;

import java.util.Scanner;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class ScannerTest2 {

    public static void main(String[] args) {
        String input = "10 apples 20 oranges 33 pears";
        Scanner s = new Scanner(input).useDelimiter("\\d*");
        String str[] = new String[6];
        int i = 0;
        while (s.hasNext()) {
            str[i] = s.next();
            System.out.println(str[i++]);
        }
        s.close();
    }

}
