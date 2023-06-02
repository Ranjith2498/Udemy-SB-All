package com.demo.example;

public class Singleton {
    private static Singleton instance;
    private static Singleton instance1;

    private Singleton() {
        // Private constructor to prevent external instantiation
    }

    public static Singleton getInstance() {
        if (instance == null && instance1 == null) {
            instance = new Singleton();
            instance1 = new Singleton();
            
           
            System.out.println("Hi"+(instance==instance1));
            
        }
        return instance;
    }
    
    public static void main(String[] args)
    {
    	Singleton singleton1 = Singleton.getInstance();
    	Singleton singleton2 = Singleton.getInstance();

    	boolean hasOnlyOneObject = singleton1 == singleton2;

    	System.out.println("Singleton has only one object: " + hasOnlyOneObject);

    }
}



