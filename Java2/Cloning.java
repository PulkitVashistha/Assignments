package com.ttnd.extra.Java2;

public class Cloning implements Cloneable{
    private int num;
    private String str;

    public Cloning(Cloning c){
        System.out.println("copy constructor called");
        num = c.num;
        str = c.str;
    }

    public Cloning(int num1,String str1){
        num = num1;
        str = str1;
    }

    public Cloning clone() {
        try {

            Cloning c = (Cloning) super.clone();
            return c;

        } catch (CloneNotSupportedException e) {

            return null;

        }
    }
    public void getValues(){
        System.out.println(this.num+"  "+this.str);
    }
}
class newClass{
    public static void main(String[] args) {
        Cloning c1 = new Cloning(24,"Hello");
        Cloning c2 = c1.clone();
        c2.getValues();
        Cloning c3 = new Cloning(c2);
        c3.getValues();
    }
}

