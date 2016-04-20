package org.fridaylunchtalk.kotlin.lamdas

/**
 * Created by Ingo on 20.04.2016.
 */
fun main(args : Array<String>) {

    val calculator = Calculator()
    calculator.add(1, 1, { result -> println(result) })

}