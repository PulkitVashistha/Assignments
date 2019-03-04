package com.ttnd.extra.Java2;

public class SingletonClass {
    private static SingletonClass instance = null;

    public String s;

    private SingletonClass(){
        s= "Hey, This is a Singleton class";
    }

    public static SingletonClass getInstance(){
        if(instance == null)
            synchronized(SingletonClass.class) {
            if(instance==null)
            instance = new SingletonClass();
        }
        return instance;
    }
}

class Main{

    public static void main(String[] args) {
        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
