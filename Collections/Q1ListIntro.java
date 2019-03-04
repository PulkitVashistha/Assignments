package com.ttnd.extra.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q1ListIntro {
    public static void main(String[] args) {
        List<Float> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            ls.add(sc.nextFloat());
        }
        float sum=0;
        Iterator iterator = ls.iterator();
        while (iterator.hasNext()){
            sum  += (Float) iterator.next();
        }
        System.out.println("Sum = "+sum);
    }
}
