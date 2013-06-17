package mzielins.scjp.book;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 5/6/13
 * Time: 3:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fabric extends Thread {
    public static void main(String[] args) {
        Thread t = new Thread(new Fabric());
        Thread t2 = new Thread(new Fabric());
        t.start();
        t2.start();

    }
//    static
    public void run() {
        for(int i = 0; i < 2; i++)
        System.out.print(Thread.currentThread().getName() + " ");
    }
}
