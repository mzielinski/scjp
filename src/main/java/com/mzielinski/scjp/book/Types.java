package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Types {

    public void int2() throws Error {

    }
    public static void main(String... args)  {

        boolean b = false;
        long i = 7l;
        double d = 1.23;
        float f = 4.56f;

        System.out.printf("%b", b);
//        System.out.printf("%i", i);
//        System.out.format("%d", d);
        System.out.format("%d", i);
        System.out.format("%f", d);
        System.out.format("%f", f);

        Types types = new Types();
        types.int2();
    }
}
