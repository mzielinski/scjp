package com.mzielinski.scjp.cast;

/**
 * @author mzielinski, Rule Financial
 */

class Pancake {
}

class BlueberryPancake extends Pancake {
}

public class SourdoughBlueberryPancake2 extends BlueberryPancake {
    public static void main(String[] args) {
        Pancake p4 = new SourdoughBlueberryPancake2();
        Pancake p5 = p4;
        Pancake p6 = (BlueberryPancake) p4;
        BlueberryPancake b2 = (BlueberryPancake) p4;
        BlueberryPancake b3 = (SourdoughBlueberryPancake2) p4;
//        SourdoughBlueberryPancake2 s1 = (BlueberryPancake) p4;
        SourdoughBlueberryPancake2 s2 = (SourdoughBlueberryPancake2) p4;
    }
}

