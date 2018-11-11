package com.nal.creationalpattern.singleton;

/**
 * Created by Nishant on 09-11-2018.
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;  //static variable to hold the object of the class

    private SingletonPattern() {
        //private constructor
    }

    public static SingletonPattern getInstance()
    {
        if(singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

}
