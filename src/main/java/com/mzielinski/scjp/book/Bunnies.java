package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bunnies {

    static int count = 0;

    Bunnies() {
        while (count < 10) new Bunnies(++count);
    }

    Bunnies(int x) {
        super();
    }

    public static void main(String[] args) {
        new Bunnies();
        new Bunnies(count);
        System.out.println(count++);
    }
}