package com.mzielinski.scjp.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mzielinski, Rule Financial
 */
public class Parent {
    public void amethod(int i) throws IOException {

        outer:	for (int x = 0; x<3; x++)
        {
            middle: for (int y = 0; y<3; y++)
            {
                inner: for (int z = 0; z<3; z++)
                {
                    if (y==1)
                    {
                        break middle;
                    }
                }
            }
        }
    }
}

class Child extends Parent {

    @Override
//    public void amethod(int i) throws IOException, RuntimeException {}
    public void amethod(int i) throws FileNotFoundException {}
//    public void amethod(int i) {}
//    public void amethod(int i) throws RuntimeException {}
//    public void amethod(int i) throws Exception {} - Wrong
//    public void amethod(int i) throws Throwable {} - Wrong

    public static void main(String ... args) throws IOException {
        Parent parent = new Parent();
        parent.amethod(1);
    }
}
