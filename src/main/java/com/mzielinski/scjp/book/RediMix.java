package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 10:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class RediMix extends Concrete {

    RediMix() {
        System.out.println("r ");
    }

    public static void main(String[] args) {
        new RediMix();
    }
}

class Concrete extends Sand {
    Concrete() {
        System.out.print("c ");
    }

    private Concrete(String s) {
    }
}

abstract class Sand {
    Sand() {
        System.out.print("s ");
    }
}
