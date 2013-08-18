package pl.mzielinski.scjp.package6;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Test {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        float[] j = new float[5];
        for (int k = 0; k < j.length; k++) {
            i[k] = (char) j[k];
            System.out.println(i[k]);
        }
    }
}
