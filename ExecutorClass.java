package com.ttnd.extra.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000l);
                        System.out.println("Thread 1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000l);
                        System.out.println("Thread 2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 3");
                    } catch (InterruptedException e) {
//                    e.printStackTrace();
                    }
                }
            });

        } finally {
            System.out.println("Finally block");
            executorService.shutdownNow();
        }

        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        System.out.println("End");
    }
}
