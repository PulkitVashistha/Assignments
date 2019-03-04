package com.ttnd.extra.Java2;

public class Sort {
    public static void main(String[] args) {
        String a = "akash gupta";
        char[] b = a.toCharArray();
        char c,temp;
        int index;
        for(int i =0;i<a.length();i++){
            c=b[i];
            index = i;
            for(int j=i+1;j<a.length();j++){
                if(c>b[j]){
                    index=j;
                    c=b[j];
                }
            }
            temp=b[i];
            b[i] = b[index];
            b[index]=temp;
        }
        System.out.println(b);
    }
}
