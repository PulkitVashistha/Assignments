package com.ttnd.extra.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllMethod {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> runnableList = new ArrayList<>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
//                Thread.sleep(1000l,);
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });

        ExecutorService executorService = Executors
                .newSingleThreadExecutor();

        List<Future<Integer>> futureList = executorService.invokeAll(runnableList);

        executorService.awaitTermination(1000l,TimeUnit.MILLISECONDS);
        executorService.shutdown();
        futureList.forEach((e)->{
            if(e.isDone()){
                try {
                    System.out.println(e.get());

                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });


    }
}






