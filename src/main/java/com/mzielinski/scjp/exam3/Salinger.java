package com.mzielinski.scjp.exam3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mzielinski, Rule Financial
 */

class Author {
    protected void write(long x) throws IOException {
        throw new IOException();
    }
}

public class Salinger extends Author {

    private void write(int x) {}

    protected void write(long x) throws FileNotFoundException {}

    protected void write(boolean x) {}

    protected int write(short x) {
        return 7;
    }

    public void write() {}

    public static void main(String... args) throws FileNotFoundException {
        Salinger author = new Salinger();
        author.write(10l);
    }
}
