package com.mzielinski.scjp.concurrency;

/**
 * @author mzielinski, Rule Financial
 */

public class Weather {

    public static void main(String[] args) {
        Forecaster forecaster = new Forecaster();
        new Listener(forecaster);
        new Listener(forecaster);
        new Listener(forecaster);
    }

    private static class Forecaster extends Thread {
        private int tomorrowTemp;

        public Forecaster() {
            start();
        }

        public synchronized int getTomorrowTemp() {
            return tomorrowTemp;
        }

        @Override
        public void run() {
            try {
                while(true) {
                    sleep(1000);
                    synchronized (this) {
                        tomorrowTemp = (int) (40 * Math.random() - 10);
                        notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    private static class Listener extends Thread {

        private final Forecaster forecaster;

        public Listener(Forecaster forecaster) {
            this.forecaster = forecaster;
            start();
        }

        @Override
        public void run() {
            try {
                while(true) {
                    synchronized (forecaster) {
                        forecaster.wait();
                    }
                    System.out.printf("[%s] I heard tomorrow's temperature will be [%d] C%n",
                            Thread.currentThread().getName(), forecaster.getTomorrowTemp());
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
