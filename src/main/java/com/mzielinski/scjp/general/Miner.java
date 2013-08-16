package com.mzielinski.scjp.general;

/**
 * @author mzielinski, Rule Financial
 */
class Mineral {
    int over = 1;
}

class Gem extends Mineral{
    int over = 2;
}

public class Miner extends Gem {

    int over = 3;

    static int x = 7;
    static String s = null;
    public static void getWeight(Mineral m) {
        int y = 0 / x;
        System.out.println(s + "");
    }

    private void go() {
        Gem m1 =new Miner();
        Mineral m2 = new Miner();
        System.out.println(super.over + " " + m1.over + " " + m2.over);
    }

    public static void main(String... args) {
        Mineral[] minerals = new Mineral[] { new Mineral(), new Gem()};
        for (Object o : minerals) {
            getWeight((Mineral) o);
        }
        new Miner().go();
    }
}
