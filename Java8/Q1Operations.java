package com.ttnd.extra.Java8;


interface Great{
    boolean great(int x,int y);
}
interface Increament{
    int increment(int x);
}
interface Concatination{
    String concat(String s1,String s2);
}
interface Uppercase{
    String upper(String s);
}
public class Q1Operations {
    public static void main(String[] args) {
        Great great = (x,y)->(x>y);
        Increament increament = x->++x;
        Concatination concatination = (a,b)->(a+b);
        Uppercase uppercase = s->s.toUpperCase();
        System.out.println(great.great(10,5));
        System.out.println(increament.increment(5));
        System.out.println(concatination.concat("ABC","XYZ"));
        System.out.println(uppercase.upper("sdkjbidsbfidbfui"));
    }
}
