package pl.mzielinski.scjp.package9;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class MyException extends Exception {
}

class Test2 {
    void f() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e1 = null;
        Test2 t = new Test2();
        try {
            t.f();
        } catch (MyException e) {
            e1 = e;
            System.out.print("catch 1 ");
        } finally {
            try {
                throw e1;
            } catch (Exception e) {
                System.out.println("catch 2 ");
            }
        }
        System.out.println("end");
    }
}