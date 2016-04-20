package org.fridaylunchtalk.kotlin.singleton;

/**
 * Example of a singleton implementation in Java.
 */
public class SingletonInJava {

    private static final SingletonInJava INSTANCE = new SingletonInJava();

    private SingletonInJava() {
        // prevent instance creation
    }

    public static SingletonInJava getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }

}
