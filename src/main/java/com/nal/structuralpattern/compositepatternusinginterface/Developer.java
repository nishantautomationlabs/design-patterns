package com.nal.structuralpattern.compositepatternusinginterface;

/**
 * Created by Nishant on 13-11-2018.
 */
public class Developer implements IEmployee {

    private String name;
    private int salary;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
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
        System.out.println("Developer Name " + name);
        System.out.println("Developer Salary " + salary);
    }
}
