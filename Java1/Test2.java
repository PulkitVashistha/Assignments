package com.ttnd.extra.Java1;

import static java.lang.Integer.parseInt;

public class Test2 {
    public static void main(String args[]){
        String a = "checking for duplicates in a string";
        String[] b = a.split("");
        int[] c = new int[150];
        String newS="";
        for(int j=0;j<150;j++){
            c[j]= 0;
        }
        for(int i=0;i<b.length;i++){
            c[(int)(b[i].charAt(0))] = c[(int)(b[i].charAt(0))] +1;
        }
        for(int i=0;i<150;i++){
            if(c[i]>1){
                newS = Character.toString((char) i);
                System.out.println("Frequency of "+newS+" = " +c[i]);
            }
        }
    }
}
