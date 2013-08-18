package com.mzielinski.scjp.old;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Alpha {

    int doStuff(float b) {
        return 7;
    }
}

class Beta extends Alpha {

//    ERROR
//    private int doStuff(float y){
//        return 4;
//    }

//    OK
//    protected int doStuff(float y){
//        return 4;
//    }

//    ERROR
//    public Integer doStuff(float y){
//        return 4;
//    }

//    OK
//    final int doStuff(float y) {
//        return 4;
//    }

//    ERROR
//    public long doStuff(float x) {
//        return 4;
//    }

}
