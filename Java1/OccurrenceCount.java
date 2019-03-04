package com.ttnd.extra.Java1;

public class OccurrenceCount {
    public static void main(String args[]){
        String a = "New employee get new bottles and shirts and pens";
        String[] b = a.split(" ");
        int[] count = new int[b.length];
        for(int i=0;i<b.length;i++){
            count[i]=1;
        }

        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){

              if(b[i].equals(b[j])){
                  count[i] = count[i] + 1;
              }

            }
        }
        for(int i=0;i<b.length;i++){
            if(count[i]>1){
                System.out.println("Occurence of word :"+b[i]+": is ="+count[i]);
            }
        }
    }
}
