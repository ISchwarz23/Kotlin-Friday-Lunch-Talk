package org.fridaylunchtalk.kotlin.lamdas;

/**
 * Example class providing a method taking a callback.
 */
public class Calculator {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public void add(int number1, int number2, ResultCallback<Integer> callback) {
        // do long running stuff here
        callback.onResult(number1 + number2);
    }

    interface ResultCallback<T> {
        void onResult(T result);
    }

}
