package com.ttnd.extra.Java1;

public class RepeatedElement {
    public static void main(String[] args) {
        int[] ar = {1,4,7,8,2,0,5,8,5,1,2,4,0};
        int b=0;
        for(int i=0;i<ar.length;i++){
            b=b^ar[i];
        }
        System.out.println(b);
    }
}
