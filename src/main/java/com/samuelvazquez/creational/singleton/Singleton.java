package com.samuelvazquez.creational.singleton;

/**
 * Singleton class defines the `getInstance` method that lets
 * clients access the same instance throughout the program
 */

public class Singleton {
    // field for storing the singleton instance just like a global variable
    private static Singleton instance;

    public String value;

    // default constructor private, to prevent other objects from using the new operator with the Singleton class
    private Singleton(String value) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    /**
     * A static creation method that acts as a constructor.
     * This method calls the private constructor to create an object and saves it in a static field.
     * Calling this method is the only way of getting the Singleton object
     * @param value
     *        output message to validate object operation
     * @return a created new object or an existing one if it has already created
     */
    public static Singleton getInstance(String value) {
        //double-checked locking (DCL) to prevent race condition between multiple threads
        Singleton result = instance;
        if(result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
