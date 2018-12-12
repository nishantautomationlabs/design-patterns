package com.nal.structuralpattern.compositepatternusinginterface;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Nishant on 13-11-2018.
 */
public class Manager implements IEmployee {

    private ArrayList<IEmployee> employees;
    private String name;
    private int salary;

    public Manager(String name, int salary) {
        this.employees = new ArrayList<>();
        this.name = name;
        this.salary = salary;
    }

    public void add(IEmployee employee) {
        employees.add(employee);
    }

    public void remove(IEmployee employee) {
        employees.remove(employee);
    }

    public IEmployee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Salary: " + salary);

        Iterator<IEmployee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext())
        {
            IEmployee employee = employeeIterator.next();
            employee.print();
        }
    }


}
