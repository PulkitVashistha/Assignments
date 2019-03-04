package com.ttnd.extra.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{

    Double age;
    Double salary;
    String name;
    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return age+" "+salary+" "+name;
    }

    @Override
    public int compareTo(Employee o) {
        if(salary>o.salary)
            return -1;
        else
        return 1;
    }
}
public class Q4Sort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(34.0, 15000.0,"Pulkit"));

        list.sort(Employee::compareTo);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(((Employee)iterator.next()).toString());
        }

    }
}
