package com.mzielinski.scjp.strings;

/**
 * @author mzielinski, Rule Financial
 */
public class ReferenceTest {

    private class Container {
        private final String string;
        private Container(String string) {
            this.string = string;
        }
    }

    public static void main(String[] args) {
        ReferenceTest test = new ReferenceTest();
        test.start();
    }

    private void start() {
        Container container = new Container("one");
        String string2 = alter(container);
        System.out.println(container.string + " " + string2);
    }

    private String alter(Container container) {
        Container newContainer = new Container(container.string + " two");
        System.out.print(newContainer.string + " ");
        return "three";
    }
}
