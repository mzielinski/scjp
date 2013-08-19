package com.mzielinski.scjp.serializable;

import java.io.*;

/**
 * @author mzielinski, Rule Financial
 */

class Test implements Serializable {

    transient int i = 4;

    Test() {
        i = 5;
    }

    void setI(int i) {
        this.i = i;
    }

    int getI() {
        return i;
    }
}

public class Serialize {

    public static void main(String[] args) throws Exception {
//        if (args[0].equals("S")) {
            Test t = new Test();
            t.setI(8);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.tmp"));
            oos.writeObject(t);
            oos.close();
//        } else if (args[0].equals("D")) {
            Test t2 = new Test();
            t2.setI(8);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.tmp"));
            t2 = (Test) ois.readObject();
            System.out.println(t2.getI());
            ois.close();
//        }
    }

}
