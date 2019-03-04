package com.ttnd.extra.Java8;

interface Greater {
    public boolean greaterThan(int x, int y);
}

interface Increment{
    public int increaseIt(int x);
}

interface Concat{
    public String concatenation(String x,String y);
}

interface Case{
    public String upperCase(String x);
}

interface Generic{
    public  String genericConcat(Object obj1,Object obj2);
}

interface Generic2<t,h,g>{
    g Sum(t x,h y);
}
class MainClass{
    public static void main(String[] args) {
        Greater greater = (x,y)->x>y;
        Increment increment = x->(++x);
        Concat concat = (x,y)->(x+y);
        Case c = x->x.toUpperCase();
        Generic generic = (x,y)->x.toString()+y.toString();
        Generic2<Integer,Integer,String> generic2 = (x,y)->(x+""+y);
        System.out.println(greater.greaterThan(5,6));
        System.out.println(increment.increaseIt(5));
        System.out.println(concat.concatenation("abc","xyz"));
        System.out.println(c.upperCase("adkjfbjbdf"));
        System.out.println(generic.genericConcat(34,67));
        System.out.println(generic2.Sum(54,67));
    }
}
