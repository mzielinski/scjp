package pl.mzielinski.scjp.asserts;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class AssertTest {

    public static void main(String[] args) {
        float f1 = Float.NaN;
        float f2 = f1;
        float f3 = 1.2f;

        try {
            assert (f2 == f1) : f2 = 2;
            f3 = 1.5f;
        } catch (AssertionError ae) {
            System.out.println(ae);
            f3++;
        }

        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("hello");

        System.out.println("equals: " + s1.equals(s2));

        f3 += f2;
        System.out.println("f3 = " + f3);

        int val = 1;
        switch (val) {
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }

}
