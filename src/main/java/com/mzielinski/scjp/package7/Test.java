package pl.mzielinski.scjp.package7;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {
    public abstract class InnerTest {
        abstract void f();
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test.InnerTest test = t.new InnerTest() {
            public void f() {
                System.out.println("Inner f");
            }
        };
    }
}