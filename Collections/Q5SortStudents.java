package com.ttnd.extra.Collections;

import java.util.*;

class Students implements Comparable<Students>{
    String name;
    Double score;
    Double age;
    public Students(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    @Override
    public int compareTo(Students s) {
        if(score>s.score){
            return 1;
        }
        else if(score<s.score){
            return -1;
        }
        else{
            return (name.compareTo(s.name));
        }
    }

}

public class Q5SortStudents {
    public static void main(String[] args) {
        Students[] s = new Students[4];
        s[0] = new Students("Mansi", 100.0, 22.0);
        s[1] = new Students("Ram", 80.0, 22.0);
        s[2] = new Students("Shyam", 80.0, 20.0);
        s[3] = new Students("Mohan", 80.0, 20.0);
        Arrays.sort(s);
        for(int i=0;i<4;i++) {
            System.out.println("Name: " + s[i].name + ", Score: " + s[i].score + ", Age: " + s[i].age);
        }
    }
}
