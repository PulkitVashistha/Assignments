package com.ttnd.extra.Java8;

@FunctionalInterface
interface Employee{
    Q4Employee employee(String name, Integer age, String city);
}

public class Q4Employee {
    String name;
    Integer age;
    String city;
    public Q4Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        Employee emp = Q4Employee::new ;
        emp.employee("Rahul",22,"Moradabad");
        System.out.println(emp);
    }

}
