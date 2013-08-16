package com.mzielinski.scjp.patterns;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author mzielinski, Rule Financial
 */

class SafeDeposit {

    private static SafeDeposit singleton;

    public static SafeDeposit getInstance(int code) {
        if (singleton == null) {
            singleton = new SafeDeposit(code);
        }
        return singleton;
    }

    private int code;

    private SafeDeposit(int c) {
        code = c;
    }

    int getCode() {
        return code;
    }
}

class CallableSafeDeposit implements Callable<SafeDeposit> {

    private final int code;

    CallableSafeDeposit(int code) {
        this.code = code;
    }

    @Override
    public SafeDeposit call() throws Exception {
        return SafeDeposit.getInstance(code);
    }
}

public class BeSafe {

    public static final int NUMBER_OF_CALLBACKS = 1000000;

    private final static ExecutorService pool = Executors.newFixedThreadPool(10);

    private AtomicReference<SafeDeposit> safeDeposit = new AtomicReference<SafeDeposit>();

    public static void main(String... args) throws Exception {

        BeSafe object = new BeSafe();

        final Set<Future<SafeDeposit>> futures = new HashSet<Future<SafeDeposit>>();
        for (int i = 0; i < NUMBER_OF_CALLBACKS; i++) {
            Callable<SafeDeposit> callable = new CallableSafeDeposit(i);
            Future<SafeDeposit> future = pool.submit(callable);
            futures.add(future);
        }

        for (Future<SafeDeposit> future : futures) {
            object.getSafeDeposit(future.get());
        }

        pool.shutdown();
    }

    private synchronized void getSafeDeposit(SafeDeposit currentDepositInstance) {
        SafeDeposit deposit = safeDeposit.get();
        if (deposit == null) {
            safeDeposit.set(currentDepositInstance);
            System.out.println("initializing safeDeposit with code " + currentDepositInstance.getCode());
        } else if (deposit.getCode() != currentDepositInstance.getCode()) {
            String message = String.format("SafeDeposit is different (code: %d) than current version of " +
                    "deposit instance (code: %d)", deposit.getCode(), currentDepositInstance.getCode());
            System.out.println(message);
        }
    }
}
