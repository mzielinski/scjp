package com.mzielinski.scjp.thread;

/**
 * @author mzielinski, Rule Financial
 */

class MyRunnable implements Runnable {
    String[] s;
    public MyRunnable(String[] s) {
        this.s = s;
    }
    public void run() {
        synchronized(this) {
            try{
                wait(3000);
                System.out.println(s[0] + s[1] + s[2]);
            }
            catch (InterruptedException e){}
        }
    }
}

class JoinWait {
    public static void main(String[] args) throws Exception{
        String[] s = new String[]{"1", "2", "3"};
        MyRunnable myRunnable = new MyRunnable(s);
        Thread t1 = new Thread(myRunnable);
        t1.start();
        t1.join(2000);
        s[0] = "A";
        s[1] = "B";
        s[2] = "C";
    }
}