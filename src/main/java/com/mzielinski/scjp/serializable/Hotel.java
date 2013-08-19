package com.mzielinski.scjp.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * User: mzielinski
 * Date: 8/15/13 8:16 PM
 */
public class Hotel implements Serializable {

    private transient Room room = new Room();

    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room {
}