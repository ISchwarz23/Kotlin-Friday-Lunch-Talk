package org.fridaylunchtalk.kotlin.singleton;

/**
 * Created by Ingo on 20.04.2016.
 */
public class UsingSingletonFromJava {

    public static void main(String[] args) {
        SingletonInJava.getInstance().sayHello();
        SingletonInKotlin.INSTANCE.sayHello();
    }

}
