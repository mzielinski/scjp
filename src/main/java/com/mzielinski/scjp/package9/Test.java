package pl.mzielinski.scjp.package9;

/**
 * @author Maciej Zielinski, Rule Financial
 */
abstract class AbstractTest {
    static int i;
    abstract Object test();
    AbstractTest() {
        System.out.println("A");
    }
}

public class Test extends AbstractTest {
    @Override
    Long test() {
        return Long.decode(String.valueOf(i));
    }
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.test());
    }
}