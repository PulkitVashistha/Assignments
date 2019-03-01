package com.ttnd.extra.MultiThreading;

public class SleepnJoin {
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                    System.out.println("Running 1st Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000L);
                    System.out.println("Running 2st Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        Thread.sleep(2000l);

        System.out.println("Main Ended");

    }
}
