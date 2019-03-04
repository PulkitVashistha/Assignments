package com.ttnd.extra.Java1;

public class Price {
    public static void main(String[] args) {

        Price p = new Price();
        System.out.println("Add 2 , 3 : "+p.addition(2,3));
        System.out.println("Add 13.7 , 45.6 : "+p.addition(13.7,45.6));
        System.out.println("Multiply 4.4 , 5.5 : "+p.mul(4.4f,5.5f));
        System.out.println("Multiply 4 , 5 : "+p.mul(4,5));
        System.out.println("Concatenation of Good,Luck : "+p.con("Good","Luck"));
        System.out.println("Concatenation of Good,Luck,Man : "+p.con("Good","Luck","Man"));
    }
    public int addition(int a,int b){
        return a+b;
    }
    public double addition(double a,double b){
        return a+b;
    }
    public float mul(float a,float b){
        return a*b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public String con(String a,String b){
        return a.concat(b);
    }
    public String con(String a,String b,String c){
        return a.concat(b.concat(c));
    }
}
