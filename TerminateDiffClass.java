package com.ttnd.extra.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TerminateDiffClass {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000l);
                        System.out.println("Thread3");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }finally {
            executorService.shutdownNow();
        }

        if(executorService.isShutdown()){
            System.out.println("Is shutdown");
        }
        if(executorService.isTerminated()){
            System.out.println("Is terminated");
        }
    }

}
