package com.ttnd.extra.Java2;

public class Handling {
    public static void main(String[] args) {


        try {
            if(true)
            throw new ClassNotFoundException("Exception1 ");
            else
            throw  new  NullPointerException("NPE");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }catch (NullPointerException e){
            System.out.println("null pointer exception");
        }finally{
            System.out.println("finally block");
        }
    }
}
