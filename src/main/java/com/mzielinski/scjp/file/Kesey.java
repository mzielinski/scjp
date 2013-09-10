package com.mzielinski.scjp.file;

import java.io.File;
import java.io.FileWriter;

/**
 * @author mzielinski, Rule Financial
 */
public class Kesey {

    public static void main(String[] args) throws Exception {
        File file = new File("bigData.txt");
        FileWriter w = new FileWriter(file);
//        w.println("lots o' data");
        w.flush();
        w.close();
    }

}
