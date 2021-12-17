package com.Employee;

/**
 * This program demonstrate parameter passing in Java
 * @version 1.01 2021-12-13
 * @author LLT
 */
public class ParamTest {
    public static void main(String[] args)
    {
        /**
         * Test 1:Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent=10.0;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);

        /**
         * Test 2: Methods can change the stste of object parameters
         */
        System.out.println("\nTesting tripleSalary:");
        var harry=new EmployeeClass("Harry",50000);
        System.out.println("Before: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary="+harry.getSalary());

        /**
         * Test 3:Methods can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap");
        var a=new EmployeeClass("Alice",70000);
        var b=new EmployeeClass("Bob",60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a,b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
    }


    public static void tripleValue(double x)//doesn't work
    {
        x=3*x;
        System.out.println("End of the method: x="+x);
    }

    public static void tripleSalary(EmployeeClass x)//works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }

    public static void swap(EmployeeClass x,EmployeeClass y)
    {
        EmployeeClass temp=x;
        x=y;
        y=temp;
        System.out.println("End of the method: x="+x.getName());
        System.out.println("End of the method: y="+y.getName());
    }

}


class EmployeeClass     //simplified EmployeeClass class
{
    private String name;
    private double salary;

    public EmployeeClass(String n,double s)
    {
        name=n;
        salary=s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
