package pl.mzielinski.scjp.package1;

/**
 * What will happen when you attempt to compile and run the following code?
 *
 * @author Maciej Zielinski, Rule Financial
 */
public final class Test {
    class Inner {
        void test() {
            if (Test.this.bool)
            {
                myMethod();
            }
        }
    }

    private boolean bool = false;

    public void myMethod() {
        System.out.println("myMethod");
    }

    public Test() {
        (new Inner()).test();
    }

    public static void main(String[] args) {
        new Test();
    }
}
