package org.fridaylunchtalk.kotlin.methodextension

/**
 * Example of Method extension for the class {@link String}.
 */
fun String.greet() = println("Hello ${this}!")



fun main(args : Array<String>) {

    "World".greet()

}