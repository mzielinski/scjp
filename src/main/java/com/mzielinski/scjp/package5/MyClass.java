package pl.mzielinski.scjp.package5;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class MyClass {
    static int x;

    public static void main(String[] args) {
        x = 5;
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        MyClass m3 = new MyClass();
        m1.x = 10;
        m2.x = 20;
        m3.x = 30;
        System.out.println(m1.x);
        System.out.println(m2.x);
        System.out.println(m3.x);
    }
}
