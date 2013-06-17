package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Jail {

    private int x = 4;

    public static void main(String[] args) {
        int x = 6;
        new Jail().new Cell().slam();
    }

    class Cell {
        void slam() {
            System.out.println("throw away key " + x);
        }
    }
}
