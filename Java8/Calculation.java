package com.ttnd.extra.Java8;
class Main{

interface Calculation {
    public int multiply(int x,int y);
}

    public static void main(String[] args) {
//        Calculation calculation = new Calculation() {
//            @Override
//            public int multiply(int x, int y) {
//                return x*y;
//            }
//        };

//        System.out.println(calculation.multiply(5,10));

        System.out.println(((Calculation)(x,y)-> x*y).multiply(5,10));
    }
}
