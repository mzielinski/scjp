package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */

class Bango {}
class Bongo extends Bango {}
class Bingo extends Bongo {}

public class Putter {

    public static void main(String[] args) {
        Bango b1 = new Bango();
        Bango b2 = new Bongo();
        Bango b3 = new Bingo();
//        Bongo b4 = b2;
        Bongo b5 = (Bongo) b2;
        Bango b6 = b3;
        Bango b7 = (Bango) b3;
//        Bingo b8 = b3;
        Bingo b9 = (Bingo) b3;
        Bango b10 = (Bongo) b3;

        System.out.println("FXOPTION/VANILLA/USD/VANILLA".replaceAll("[VILAN]+", "ASIAN"));
    }
}
