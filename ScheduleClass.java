package com.ttnd.extra.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleClass {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);


        executorService
                .scheduleAtFixedRate(new Runnable() {
                              @Override
                              public void run() {
                                  try {
                                      Thread.sleep(1000l);
                                      System.out.println("Task being executed");
                                  }catch (InterruptedException e){
                                      e.printStackTrace();
                                  }
                              }
                          },
                        0,2,
                        TimeUnit.SECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 5 second");
                              }
                          },
                        0,3,
                        TimeUnit.SECONDS);




    }
}
