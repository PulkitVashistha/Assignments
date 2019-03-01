//package com.ttnd.extra.MultiThreading;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Person {
//    private String fName;
//    private String lName;
//    private int phone;
//
//
//    public Person(String fName, String lName, int phone) {
//        this.fName = fName;
//        this.lName = lName;
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return fName+lName+" "+phone;
//    }
//}
//class Employee extends Person {
//    private String eCode;
//    private String competency;
//    private int salary;
//
//
//    public Employee(String fName, String lName, int phone, String eCode, String competency, int salary) {
//        super(fName, lName, phone);
//        this.eCode = eCode;
//        competency = competency;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+" "+eCode+" "+competency+" "+salary;
//    }
//}
//
//class Manager extends Person{
//    public Manager(String fName, String lName, int phone) {
//        super(fName, lName, phone);
//    }
//}
//public class Temp {
//    public static void main(String[] args) {
//
//        List<Employee> emp = new ArrayList<>();
//        emp.add(new Employee("Pulkit","Vashistha",9411,"E234","AMC",15000));
//        addValues(emp);
//        System.out.println(emp);
//
//    }
//    public static void addValues(List<? extends Person> person){
//        person.add(new Employee("Pulkit","Vashistha",9411,"E234","AMC",15000));
//        person.add(new Manager("Pulkit","Vashistha",567));
//    }
//}
