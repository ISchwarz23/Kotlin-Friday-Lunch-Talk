package org.fridaylunchtalk.kotlin.singleton;

/**
 * Example of using a Kotlin/Java singleton from Java.
 */
public class UsingSingletonFromJava {

    public static void main(String[] args) {
        SingletonInJava.getInstance().sayHello();
        SingletonInKotlin.INSTANCE.sayHello();
    }

}
