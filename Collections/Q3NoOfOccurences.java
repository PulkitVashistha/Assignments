package com.ttnd.extra.Collections;

import java.util.*;

public class Q3NoOfOccurences {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        countChar(s);
    }
    public static void countChar(String s){

        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            char ch = (char)iterator.next();
            System.out.println("Occurence of "+ch+" = "+Collections.frequency(list,ch) );
        }
    }
}
