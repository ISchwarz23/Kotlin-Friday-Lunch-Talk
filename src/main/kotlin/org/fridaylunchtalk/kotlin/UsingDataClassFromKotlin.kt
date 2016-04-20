package org.fridaylunchtalk.kotlin

/**
 * Created by Ingo on 20.04.2016.
 */
fun main(args: Array<String>) {
    val dataClassInKotlin = DataClassInKotlin(1, "Kotlin Class")
    dataClassInKotlin.nickname = "Nick"
    println(dataClassInKotlin)

    val dataClassInJava = DataClassInJava(0, "Java Class")
    dataClassInJava.nickname = "Nick"
    println(dataClassInJava)
}

