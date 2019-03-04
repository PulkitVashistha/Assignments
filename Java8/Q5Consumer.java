package com.ttnd.extra.Java8;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println("Consumer: "+str);
        consumer.accept("Rahul");
        Supplier<String> supplier = () -> "Rahul";
        System.out.println("Supplier: "+supplier.get());
        Predicate<Integer> predicate = i-> i<5;
        System.out.println("Predicate: "+predicate.test(6));
        Function<String, String> concateString = str -> str + "Vashistha";
        System.out.println(concateString.apply("Rahul "));
    }
}