package pl.mzielinski.scjp.package10;

/**
 * What is the result of compiling and running the following code?
 *
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {
    public static void main(String[] args) {
        Character c = 65;         //line 1
        Character d = new Character('A');
        if (c < d)                //line 3
            System.out.println("True");
        else System.out.println("False");
    }
}

