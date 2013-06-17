package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
class Feline { }
public class BarnCat2 extends Feline {
    public static void main(String[] args) {
        Feline ff = new Feline();
        BarnCat2 b = new BarnCat2();
//        if(b instanceof ff) System.out.print("1 ");
//        if(b.instanceof(ff)) System.out.print("2 ");
        if(b instanceof Feline) System.out.print("3 ");
//        if(b instanceOf Feline) System.out.print("4 ");
//        if(b.instanceof(Feline)) System.out.print("5 ");
    }
}
