package com.mzielinski.scjp.collections;

import java.util.PriorityQueue;

/**
 * @author mzielinski, Rule Financial
 */
public class Priorities {

    public static void main(String[] args) {
        PriorityQueue<String> toDo = new PriorityQueue<String>();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        System.out.print(toDo.size() + " " + toDo.poll());
        System.out.print(" " + toDo.peek() + " " + toDo.poll());
        System.out.println(" " + toDo.poll() + " " + toDo.poll());
    }

}
