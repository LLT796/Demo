package com.Employee;

import java.time.LocalDate;

/**
 * This program tests the Employee class
 * @version 1.13 2021-12-13
 * @author LLT
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        //fill the staff array with three Employee objects
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("CC",75000,1987,12,15);
        staff[1]=new Employee("HH",50000,1989,10,1);
        staff[2]=new Employee("TT",40000,1990,3,15);

        //raise everyone's salary by 5%
        for(Employee e:staff)
            e.raiseSalary(5);

        //print out information about all Employee objects
        for(Employee e:staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
    }
}

class Employee
{
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    //constructor
    public Employee(String n,double s,int year,int month,int day)
    {
        name=n;
        salary=s;
        hireDay=LocalDate.of(year,month,day);
    }

    //a method
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise=this.salary*byPercent/100;
        this.salary+=raise;
    }
}
