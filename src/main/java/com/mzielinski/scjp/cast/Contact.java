package com.mzielinski.scjp.cast;

/**
 * @author mzielinski, Rule Financial
 */
class Contact {
    String doStuff() {
        return "howdy ";
    }
}

class Supplier extends Contact {
    String doStuff() {
        return "send money ";
    }

    public static void main(String[] args) {
        Supplier s1 = new Supplier();
        Contact c3 = new Contact();
        Contact c1 = s1;
        Supplier s2 = (Supplier) c1;
//        Supplier s3 = (Supplier) c3;
//        Supplier s4 = new Contact();
    }
}