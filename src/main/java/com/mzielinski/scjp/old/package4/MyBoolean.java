package pl.mzielinski.scjp.package4;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class MyBoolean {
    Boolean bool[] = new Boolean[5];

    public static void main(String[] args) {
        MyBoolean myBoolean = new MyBoolean();
        myBoolean.myMethod();

        for (int i = -9; i < 9; i++) {
            myBoolean.doSomething(i);
        }
    }

    void doSomething(int i) {
        int a = i % 3;
        if (a == 1) {
            // some action for a=1
        } else if (a == 2) {
            // some action for a=2
        } else {
            assert a == 0 : i = a;
            System.out.printf("some action for a=[%d], i=[%d]%n", a, i);

        }
    }

    public void myMethod() {

        if (bool[1] == null) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
    }
}
