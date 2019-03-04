package com.ttnd.extra.Java8;

@FunctionalInterface
interface Calculation{
    int calculate(int a, int b);
}
public class Q3Calculation {
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Calculation add = new Q3Calculation()::add;
        System.out.println("The addition is:"+add.calculate(2,3));
        Calculation subtract = new Q3Calculation()::subtract;
        System.out.println("The subtraction is: "+subtract.calculate(4,2));
        Calculation multiply = Q3Calculation::multiply;
        System.out.println("The multiplication is: "+multiply.calculate(2,3));
    }
}