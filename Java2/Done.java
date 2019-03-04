package com.ttnd.extra.Java2;

import java.util.Scanner;

public class Done {
    public static void main(String[] args) {
        String s="";
        Scanner input = new Scanner(System.in);
        while(!s.equals("done")){
            System.out.print("Enter an String: ");
            s = input.next();
            if(s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
            System.out.println("out of while");
        }
        do{
            System.out.print("Enter an String: ");
            s = input.next();
            if(s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }while(!s.equals("done"));
    }
}
