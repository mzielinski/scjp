package com.mzielinski.scjp.old;

/**
 * Which of the given options are legal return types for the method callMe() in the class Test?
 *
 * @author Maciej Zielinski, Rule Financial
 */

interface X {
}

class AAAA {
}

class AAA extends AAAA implements X {
}

class BBB extends AAA {
}

class CCC extends BBB {
}

class SuperTest {
    public AAA callMe() {
        return new AAA();
    }
}

public class Test4 extends SuperTest {
    public AAA callMe() {
        return new CCC();
    }
}
