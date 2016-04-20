package org.fridaylunchtalk.kotlin.lamdas;

import org.fridaylunchtalk.kotlin.lamdas.Calculator.ResultCallback;

/**
 * Example of (non-existing) lambdas in java 1.6
 */
public class LambdaInJava {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(1, 1, new ResultCallback<Integer>() {
            public void onResult(Integer result) {
                System.out.println(result);
            }
        });
    }

}
