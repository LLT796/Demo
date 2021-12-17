package com.Employee;

import java.util.Random;

/**
 * This program demonstrate object construction.
 * @version 1.02 2021-12-14
 * @author LLT
 */
public class ConstructorTest {
    public static void main(String[] args)
    {
        //fill the staff array with three EmployeeConstructor objects
        var staff=new EmployeeConstructor[3];

        staff[0]=new EmployeeConstructor("Harry",40000);
        staff[1]=new EmployeeConstructor((60000));
        staff[2]=new EmployeeConstructor();

        //print out information about all EmployeeConstructor objects
        for(EmployeeConstructor e:staff)
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
    }
}

class EmployeeConstructor
{
    private static int nextId;

    private int id;
    private String name="";//instance field initialization
    private double salary;

    //static initialization block
    static
    {
        var generator=new Random();
        //set nextId to a random number between 0 and 9999
        nextId=generator.nextInt(10000);
    }

    //object initialization block
    {
        id=nextId;
        nextId++;
    }

    //three overload constructors
    public EmployeeConstructor(String n,double s)
    {
        name=n;
        salary=s;
    }

    public EmployeeConstructor(double s)
    {
        //calls the EmployeeConstructor(String,double) constructor
        this("EmployeeConstructor#"+nextId,s);
    }

    //the default constructor
    public EmployeeConstructor()
    {
        //name initialized to "" --see above
        //salary not explicitly set--initialized to 0
        //id initialized in initialization block
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
}
