package com.mzielinski.scjp.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author mzielinski, Rule Financial
 */
public class PrintWriterTest {

    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println("line 1");
            pw.flush();
            pw.close();
            PrintWriter pw2 = new PrintWriter("myFile.txt");
            pw2.append("line 2");
            pw.flush();
            pw2.close();
        } catch (IOException e) {
        }

        String s = "-";
        boolean b = false;
        int x = 7, y = 8;
        if ((x < 8) ^ (b = true)) s += "^";
        if (!(x > 8) | ++y > 5) s += "|";
        if (++y > 9 && b == true) s += "&&";
        if (y % 8 > 1 || y / (x - 7) > 1) s += "%";
        System.out.println(s);
    }

}
