package com.nal.structuralpattern.compositepatternusinginterface;

/**
 * Created by Nishant on 13-11-2018.
 */
public class Main {

    public static void main(String[] args) {
        Manager mgr1 = new Manager("Michael", 45000);
        Developer dev1 = new Developer("Bob", 15000);
        mgr1.add(dev1);
        Developer dev2 = new Developer("John", 25000);
        mgr1.add(dev2);
        Manager mgr2 = new Manager("Alice", 80000);
        Developer dev3 = new Developer("Michael", 30000);
        mgr2.add(dev3);
        mgr2.add(mgr1);
        mgr2.print();
    }
}
