package com.mzielinski.scjp.exam3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author mzielinski, Rule Financial
 */
public class BirdHouse {

    public static void main(String[] args) {
        String r = "0";
        int x = -1, y = -5;
        if (x < 5)
            if (y > 0)
                if (x > y)
                    r += "1";
                else r += "2";
            else r += "3";
        else r += "4";
        System.out.println(r);

        Date d = new Date();
        DateFormat df;
        Locale[] la = {new Locale("it", "IT"), new Locale("pl")};
        for (Locale l : la) {
            df = DateFormat.getDateInstance(DateFormat.FULL, l);
            System.out.println(df.format(d));
        }
    }

}
