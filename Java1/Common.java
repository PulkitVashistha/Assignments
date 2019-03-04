package com.ttnd.extra.Java1;

public class Common {
    public static void main(String[] args) {
        int[] ar = {1,3,5,7,9,12,34,45,56,45};
        int[] arr = {1,2,4,7,9,16,37,45,56,49};

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<arr.length;j++){
                if(ar[i]==arr[j]){
                    System.out.print(ar[i]+" ");
                }
            }
        }

    }
}
