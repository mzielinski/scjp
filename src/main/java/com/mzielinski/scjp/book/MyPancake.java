package mzielins.scjp.book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 6/3/13
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyPancake implements Pancake {

    public static void main(String[] args) {
        List<String> x = new ArrayList<String>();
        x.add("3");
        x.add("7");
        x.add("5");
        List<String> y = new MyPancake().doStuff(x);
        y.add("1");
        System.out.println(x);
    }

    public // has to be public !!!
    List<String> doStuff(List<String> z) {
        z.add("9");
        return z;
    }
}

interface Pancake {
    List<String> doStuff(List<String> s);
}
