package com.nal.structuralpattern.compositepatternusingabstractclass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Nishant on 13-11-2018.
 */
public class Manager extends Employee {

    private ArrayList<Employee> employees;

    public Manager(String name, int salary) {
        this.employees = new ArrayList<>();
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void print() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Salary: " + salary);

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext())
        {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }


}
