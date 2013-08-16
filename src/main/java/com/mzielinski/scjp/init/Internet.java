package com.mzielinski.scjp.init;

/**
 * @author mzielinski, Rule Financial
 */
public class Internet {

    private int y = 8;

    public static void main(String[] args) {
        new Internet().go();
    }

    void go() {
//        int x = 7; has to be final to work
        final int x = 7;
//        TCPIP ip = new TCPIP(); over is not working
        class TCPIP {
            void doit() {
                System.out.println(y + x);
            }
        }
        TCPIP ip = new TCPIP();
        ip.doit();
    }

}
