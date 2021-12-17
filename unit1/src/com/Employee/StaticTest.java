package com.Employee;

/**
 * This program demonstrate static methods.
 * @version 1.02 2021-12-13
 * @author LLT
 */

public class StaticTest {
    public static void main(String[] args)
    {
        //fill the staff array with three Employee objects
        var staff=new employee[3];

        staff[0]=new employee("Tom",40000);
        staff[1]=new employee("Dick",60000);
        staff[2]=new employee("Harry",65000);

        //print out information about all employee objects
        for(employee e:staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        int n=employee.getNextId();     //call static method
        System.out.println("Next available id="+n);
    }
}

class employee
{
    private static int nextId=1;

    private String name;
    private double salary;
    private int id;

    public employee(String n,double s)
    {
        name=n;
        salary=s;
        id=0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id=nextId;      //set id to next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;      //return static field
    }

    public static void main(String[] args)//unit test
    {
        var e=new employee("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
