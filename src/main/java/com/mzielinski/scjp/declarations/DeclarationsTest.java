package com.mzielinski.scjp.declarations;

import static com.mzielinski.scjp.declarations.EnumClass.*;
import static com.mzielinski.scjp.declarations.EnumClass.MyEnum;
import com.mzielinski.scjp.declarations.EnumClass.MyEnum;
import com.mzielinski.scjp.declarations.EnumClass.*;

/**
 * @author mzielinski, Rule Financial
 */
class DeclarationsTest {

//    public static void main(String[] args) {
//        int[] i = {1, 2, 3, 4, 5};
//        float[] j = new float[5];
//        for (int k = 0; k < j.length; k++) {
//            i[k] = (char) j[k];
//            System.out.println(i[k]);
//        }
//    }

    public static void main(String[] args) {
        for (MyEnum o : MyEnum.values())
            System.out.println(o);
    }

}
