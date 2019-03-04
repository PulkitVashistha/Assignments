package com.ttnd.extra.Java1;

enum House{
    HOUSE1(1000),HOUSE2(2000),HOUSE3(3000),HOUSE4(4000);
    private int price;
    House(int p) { price = p;}
    int getPrice() {return price;}
}
public class EnumClass {
    public static void main(String[] args) {
        System.out.println("House Prices");
        System.out.println(House.HOUSE1);
        for(House h:House.values()){
            System.out.println(h+" has price :"+h.getPrice());
        }
    }
}
