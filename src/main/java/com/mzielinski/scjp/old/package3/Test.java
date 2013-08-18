package pl.mzielinski.scjp.package3;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {
    String f(int i) {
        switch (i) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            default:
                assert false;
        }
        return "";
    }

    public static void main(String[] args) {
        Test t = new Test();
        for (int i = 0; i < 4; i++) {
            System.out.println(t.f(i));
        }
    }
}
