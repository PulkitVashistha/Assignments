package com.ttnd.extra.Java1;

public class Percentage {
    public static void main(String[] args) {
        String s = "LeveL of Confidence is very @high@ in this person : PERIOD!";
        String[] newS = s.split("");
        int[][] count = new int[4][2];
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                count[i][j]= 0;
            }
        }
        for(int i=0;i<newS.length;i++){
            if(newS[i].charAt(0)>47&&newS[i].charAt(0)<58){
                count[0][0] = count[0][0] +1;
            }
            else if(newS[i].charAt(0)>64&&newS[i].charAt(0)<91){
                count[1][0] = count[1][0] +1;
            }
            else if(newS[i].charAt(0)>96&&newS[i].charAt(0)<123){
                count[2][0] = count[2][0] +1;
            }
            else{
                count[3][0] = count[3][0] +1;
            }
        }
        for(int i=0;i<4;i++){
            count[i][1] = (count[i][0]*100)/newS.length;
        }
        for(int i=0;i<4;i++){
            switch(i){
                case 0 : {
                    System.out.print("Numbers ->");
                    break;
                }
                case 1 : {
                    System.out.print("Uppercase letters ->");
                    break;
                }
                case 2 : {
                    System.out.print("Lowercase letters ->");
                    break;
                }
                case 3 : {
                    System.out.print("Special Characters ->");
                    break;
                }
            }
            for(int j=0;j<2;j++){
                if(j==0)
                    System.out.print("count = " + count[i][j]+" ");
                else
                    System.out.print("% = " + count[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
