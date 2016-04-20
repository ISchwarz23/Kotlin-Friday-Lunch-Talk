package org.fridaylunchtalk.kotlin.dataclass

/**
 * Example of interoperability with Java from Kotlin.
 */
fun main(args: Array<String>) {
    val dataClassInKotlin = DataClassInKotlin(1, "Kotlin Class")
    dataClassInKotlin.nickname = "Nick"
    println(dataClassInKotlin)

    val dataClassInJava = DataClassInJava(0, "Java Class")
    dataClassInJava.nickname = "Nick"
    println(dataClassInJava)
}

