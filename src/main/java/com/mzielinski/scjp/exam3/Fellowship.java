package com.mzielinski.scjp.exam3;

/**
 * @author mzielinski, Rule Financial
 */
public class Fellowship {

    public static void main(String[] args) {
        int h0 = Numinor.Members.HOBBITS.getHeight();
//        int h1 = Numinor.Members.getHeight();
//        int h2 = Members.HOBBITS.getHeight();
//        int h3 = Members.height;
    }

}

class Numinor {
    enum Members {
        HOBBITS(48), ELVES(74), DWARVES(50);
        int height;
        Members(int h) { height = h; }
        int getHeight() { return height; }
    }
}
