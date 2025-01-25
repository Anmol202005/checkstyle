package com.puppycrawl.tools.checkstyle.checks.coding.magicnumber;

import java.util.concurrent.Callable;

public class Test {

    private final Callable<Void> SLEEP_FOR_A_DAY_NS = () -> {
        Thread.sleep(86400_000);
        return null;
    };

    private final Callable<Void> SLEEP_FOR_A_DAY_EXP_NS = new Callable<Void>() {
        @Override
        public Void call() throws InterruptedException {
            Thread.sleep(86400_000); // violation 'False positive'
            return null;
        }
    };
}
