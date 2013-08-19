package com.mzielinski.scjp.initialization;

/**
 * User: mzielinski
 * Date: 8/13/13 8:49 PM
 */
abstract class Hotel {

    public int bookings;

    public void book() {
        bookings++;
    }

    public abstract void book(int size);

    public static void testMethod() {}
}

public class SuperHotel extends Hotel {

    public void book() {
        bookings--;
    }

    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }

    public static void main2(String args[]) {
        Hotel hotel = new SuperHotel();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }

    public static void main(String args[]) {
        Object myObj = new String[]{"one", "two", "three"};
        {
            for (String s : (String[]) myObj) System.out.print(s + ".");
        }
    }

}
