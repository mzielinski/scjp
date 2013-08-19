package com.mzielinski.scjp.exceptions;

import java.io.FileNotFoundException;

/**
 * User: mzielinski
 * Date: 8/13/13 8:42 PM
 */
class Hotel {
    public void book() throws Exception {
        throw new InterruptedException();
    }
}

public class SuperHotel extends Hotel {
    @Override
    public void book() {
        System.out.print("booked");
    }

    public static void main(String args[]) throws Exception {
        Hotel h = new SuperHotel();
        h.book();
    }
}
