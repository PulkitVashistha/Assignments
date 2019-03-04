package com.ttnd.extra.Java1;

public class StaticClass {
    static String FirstName;
    static String LastName;
    static int age;
    static {
        FirstName = "Pulkit";
        LastName = "Vashistha";
        age = 20;
    }
    public static void main(String [] args){
        System.out.println(FirstName + " " + LastName + " " + age);
    }
}
