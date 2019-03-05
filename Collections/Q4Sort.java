package com.ttnd.extra.Collections;

import java.util.*;

class Employee{

    Double age;
    Double salary;
    String name;
    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public static Comparator<Employee> empComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.salary>o2.salary)
            return -1;
        else
        return 1;
        }
    };

    @Override
    public String toString() {
        return age+" "+salary+" "+name;
    }
//
//    @Override
//    public int compareTo(Employee o) {
//        if(salary>o.salary)
//            return -1;
//        else
//        return 1;
//    }
}
public class Q4Sort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(34.0, 15000.0,"Pulkit"));
        list.add(new Employee(33.0, 4000.0,"Ashish"));
        list.add(new Employee(35.0, 35000.0,"Naman"));
        list.add(new Employee(31.0, 55000.0,"Gaurav"));
        list.add(new Employee(30.0, 1000.0,"Mohit"));

        for (Employee emp:
             list) {
            System.out.println( emp.toString());
        }
        Collections.sort(list,Employee.empComparator);

        System.out.println("========================================");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(((Employee)iterator.next()).toString());
        }

    }
}
