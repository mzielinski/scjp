package com.mzielinski.scjp.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * User: mzielinski
 * Date: 8/13/13 9:15 PM
 */
class Empty {
}

class Extended extends Empty {
}

enum Status {
    ACTIVE, INACTIVE
}

public class TryMe {

    public static void doStuff1(List<Empty> list) {
        // some code
    }
    public static void doStuff2(List list) {
        // some code
    }
    public static void doStuff3(List<? extends Empty> list) {
        // some code
    }

    public static void main(String args[]) {

        if (Status.ACTIVE.ordinal() < Status.INACTIVE.ordinal()) {
            System.out.println("STATUS");
        }
        List<Empty> list1 = new LinkedList<Empty>();
        List<Extended> list2 = new LinkedList<Extended>();

        doStuff1(list1);
        doStuff2(list2);
        doStuff2(list1);
        doStuff3(list1);
        doStuff3(list2);
        //doStuff1(list2);


    }
}
