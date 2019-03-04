package com.ttnd.extra;

class Employee{
    int number;

    public int getNumber() {
        return number;
    }

    public Employee(int number) {
        this.number = number;
    }
}
class Practise implements Cloneable{
    int digit;
    Employee emp;

    public Practise(int digit, int number) {
        this.digit = digit;
        this.emp = new Employee(number);
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    protected Practise clone() throws CloneNotSupportedException {
        return (Practise) super.clone();
    }
}

class Main{
    public static void main(String[] args) {
        Practise p1 = new Practise(23,45);
        try {
            Practise p2 = p1.clone();
            Employee emp = new Employee(67);
            p2.setEmp(emp);
            System.out.println(p1.getEmp().getNumber()+" "+p2.getEmp().getNumber());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
