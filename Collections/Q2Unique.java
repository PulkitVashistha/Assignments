package com.ttnd.extra.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2Unique {
    public static void main(String[] args) {
        String s ;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int i = countUnique(s);
        System.out.println("Number of unique characters = "+i);
    }
    public static int countUnique(String s){

        Set<Character> hashSet = new HashSet<>();
        for(int i=0;i<s.length();i++)
        hashSet.add(s.charAt(i));

        return hashSet.size();
    }
}
