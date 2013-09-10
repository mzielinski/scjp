package com.mzielinski.scjp.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzielinski, Rule Financial
 */
class Radio {
    String getFreq() {
        return "97.3";
    }

    static String getF() {
        return "97.3";
    }
}

class Ham extends Radio {

    String getFreq() {
        return "50.1";
    }

    static String getF() {
        return "50.1";
    }

    public static void main(String[] args) {
        List<Radio> radios = new ArrayList<Radio>();
        radios.add(new Radio());
        radios.add(new Ham());
        for (Radio r : radios)
            System.out.print(r.getFreq() + " " + r.getF() + " ");
    }
}
