package com.ttnd.extra.MultiThreading;

class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Runnable Thread");
    }


    public static void main(String[] args) {
        new Thread(new RunnableDemo())
                .start();
    }
}

class ThreadDemo extends Thread{

    @Override
    public void run(){
        System.out.println("Running Thread Demo");
    }

    public static void main(String[] args) {
        new ThreadDemo().start();
    }

}

public class Practise {
    public static void main(String[] args) {
      new Thread(new RunnableDemo()).start();
      new Thread(new ThreadDemo()).start();

    }
}
