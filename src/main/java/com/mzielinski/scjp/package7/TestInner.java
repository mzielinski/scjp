package pl.mzielinski.scjp.package7;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class TestInner {
    private static int i = 10;
    private static void f() {
        System.out.println(i);
    }
    TestInner() {
        System.out.print("Outer");
    }
    static class MyInner {
        MyInner() {
            System.out.print("Inner");
        }
        void g() {
            f();
        }
    }
    public static void main(String[] args) {
        new TestInner.MyInner();
    }
}