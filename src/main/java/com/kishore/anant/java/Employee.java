package com.kishore.anant.java;

public class Employee {
    int employeeId;
    String name;
    int age;
    double salary;
    int phoneNumber;

    String manager;

    int grade;

    // increment employee salary by certain percentage
    public void incrementSalary(double percentage){
        if(percentage > 100){
            throw new RuntimeException("Improper value found!");
        }
        this.salary *= (1+percentage/100);
    }

    /*public int incrementSalary(double manager){
        this.manager = manager;
    }*/

    public void incrementSalary(int increment){
        this.grade += increment;
    }





    //constructor for mandatory parameters
    public Employee(int number, String name, int age, double salary, int phoneNumber){
        this.employeeId = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        //System.out.println("Name::"+this.name+"\nAge::"+age+"\nPhone Number::"+this.phoneNumber);
        return "ID:: "+this.employeeId;
    }
}
