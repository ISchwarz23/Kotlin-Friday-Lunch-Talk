package org.fridaylunchtalk.kotlin.methodextension

/**
 * Created by Ingo on 20.04.2016.
 */
fun String.greet() = println("Hello ${this}!")

fun main(args : Array<String>) {
    "World".greet()
}