package com.mzielinski.scjp.serializable;

import java.io.*;

/**
 * @author mzielinski, Rule Financial
 */

class Traveler implements Serializable {

    private static int x1 = 0;
    private volatile int x2 = 0;
    private transient int x3 = 0;

    private Traveler() {}

    Traveler(int x1, int x2, int x3) {
        Traveler.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    void clear() {
        x1 = x2 = x3 = 0;
    }
    @Override
    public String toString() {
        return Traveler.x1 + " " + this.x2 + " " + this.x3;
    }

}

public class Network {

    public static void main(String[] args) {
        Traveler t = new Traveler(7, 7, 7);
        System.out.println("Before: " + t);

        serializeObject(t);
        t.clear();
        System.out.println("After clear: " + t);
        Traveler traveler = deserializeObject();

        System.out.println("After deserialization: " + traveler);
    }

    private static <T> T deserializeObject() {
        try{
            //use buffering
            InputStream file = new FileInputStream( "quarks.ser" );
            InputStream buffer = new BufferedInputStream( file );
            ObjectInput input = new ObjectInputStream( buffer );
            try{
                return (T) input.readObject();
            }
            finally{
                input.close();
            }
        }
        catch(ClassNotFoundException ex){
            System.err.println(ex);
        }
        catch(IOException ex){
            System.err.println(ex);
        }
        return null;
    }

    private static <T> void serializeObject(T t) {
        try {
            //use buffering
            OutputStream file = new FileOutputStream("quarks.ser");
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            try {
                output.writeObject(t);
            } finally {
                output.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}