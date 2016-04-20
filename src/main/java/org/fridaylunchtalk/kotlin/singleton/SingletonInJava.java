package org.fridaylunchtalk.kotlin.singleton;

/**
 * Created by Ingo on 20.04.2016.
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
