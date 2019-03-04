package com.ttnd.extra.Java1;

public class Bank {
    public static void main(String[] args) {
        SBI s = new SBI();
        BOI b = new BOI();
        ICICI i = new ICICI();
        s.getDetails();
        b.getDetails();
        i.getDetails();
    }
}
class SBI{
    String name = "SBI";
    double rate = 5.5;
    public void getDetails(){
        System.out.println("Name = "+this.name+" :: Rate = "+this.rate);
    }
}
class BOI{
    String name = "BOI";
    double rate = 6.5;
    public void getDetails(){
        System.out.println("Name = "+this.name+" :: Rate = "+this.rate);
    }
}
class ICICI{
    String name = "ICICI";
    double rate = 7.5;
    public void getDetails(){
        System.out.println("Name = "+this.name+" :: Rate = "+this.rate);
    }
}