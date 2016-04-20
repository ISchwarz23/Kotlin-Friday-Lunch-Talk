package org.fridaylunchtalk.kotlin.lamdas;

import org.fridaylunchtalk.kotlin.lamdas.Calculator.ResultCallback;

/**
 * Created by Ingo on 20.04.2016.
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
