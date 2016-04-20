package org.fridaylunchtalk.kotlin.lamdas

/**
 * Example of a lambda in Kotlin.
 */
fun main(args : Array<String>) {

    val calculator = Calculator()
    calculator.add(1, 1, { result -> println(result) })

}