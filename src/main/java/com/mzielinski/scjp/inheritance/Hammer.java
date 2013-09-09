package com.mzielinski.scjp.inheritance;

/**
 * @author mzielinski, Rule Financial
 */

abstract class Tool {
    int SKU;
    abstract void getSKU();
}

public class Hammer extends Tool {
    @Override
//    void getSKU() { ; }
//    private void getSKU() { ; }
    protected void getSKU() { ; }
//    public void getSKU() { ; }

}
