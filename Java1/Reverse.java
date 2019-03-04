package com.ttnd.extra.Java1;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("TTND Employee");
        System.out.println("Actual String "+a);
        System.out.println("Reverse String "+a.reverse());
        System.out.println("Final String "+a.delete(4,9));
    }
}
