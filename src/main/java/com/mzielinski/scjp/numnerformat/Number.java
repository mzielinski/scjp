package pl.mzielinski.scjp.numnerformat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public class Number {

    public static void main(String... args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
        numberFormat.setMaximumFractionDigits(2);
//        numberFormat.setFractionDigits(2);
        numberFormat.setMinimumFractionDigits(1);
//        numberFormat.setDecimalDigits(2);
//        numberFormat.setMaximumDecimalDigits(2);
        System.out.println(numberFormat.format(54567.678));

        String str = "aaaaaaaaabbs";
        String [] s = str.split("a{2}b{2}");
        System.out.println(s.length);

    }
}
