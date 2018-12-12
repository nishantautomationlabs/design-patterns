package com.nal.structuralpattern.compositepatternusingabstractclass;

/**
 * Created by Nishant on 13-11-2018.
 */
public class Developer extends Employee {

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Developer Name " + name);
        System.out.println("Developer Salary " + salary);
    }
}
