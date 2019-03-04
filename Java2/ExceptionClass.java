package com.ttnd.extra.Java2;

public class ExceptionClass {
    public static void main(String[] args) {
        try {

            System.out.println("Entered ClassDefNotFound catch block");
            throw new NoClassDefFoundError("Class Def not found error");

        }catch (NoClassDefFoundError e){

            try {

                throw new ClassNotFoundException("Class Not found Exception");

            } catch (ClassNotFoundException e1) {

                System.out.println("Entered ClassNotFound catch block");

            }
        }
    }
}
