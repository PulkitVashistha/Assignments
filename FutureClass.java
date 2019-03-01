package com.ttnd.extra.MultiThreading;

import java.util.concurrent.*;

public class FutureClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(1000l);
                return 2;
            }
        });

        executorService.shutdown();
        System.out.println("Shutdown"+integerFuture.isCancelled());

        if (integerFuture.isDone()) {
            try {
                System.out.println(integerFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        if(integerFuture.isCancelled()){
            System.out.println("Your task has been cancelled");
        }
    }
}
