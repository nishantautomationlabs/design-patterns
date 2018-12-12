package com.nal.structuralpattern.compositepatternusingabstractclass;

/**
 * Created by Nishant on 13-11-2018.
 */
public abstract class Employee {

    protected String name;
    protected int salary;

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public abstract void print();
}
