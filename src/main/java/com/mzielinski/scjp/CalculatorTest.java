package com.mzielinski.scjp;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author mzielinski, Rule Financial
 */

class Calculator implements Callable<Integer> {

    private final int a;
    private final int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}

public class CalculatorTest {

    private ExecutorService pool = Executors.newFixedThreadPool(3);
    private List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

    public void calculate(int a, int b) throws Exception {
        Future<Integer> future = pool.submit(new Calculator(a, b));
        saveResult(future.get());
    }

    private void saveResult(int result) {
        list.add(result);
    }

    public static void main(String... args) throws Exception {
        CalculatorTest calculatorTest = new CalculatorTest();
        for (int i = 0; i < 100000; i++) {
            calculatorTest.calculate(1, 2);
        }
        calculatorTest.pool.shutdown();
        System.out.println(calculatorTest.list.size());
    }

}
