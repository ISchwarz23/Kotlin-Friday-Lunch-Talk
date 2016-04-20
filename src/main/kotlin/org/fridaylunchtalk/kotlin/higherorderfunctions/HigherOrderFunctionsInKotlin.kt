package org.fridaylunchtalk.kotlin.higherorderfunctions

/**
 * Example for a higher order function in Kotlin.
 */
fun <T, R> List<T>.mapIt(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>();

    for (item in this) result.add(transform(item))

    return result
}

fun transformToString(number: Int): String = "$number"



fun main(args: Array<String>) {

    val listOfNumbers = arrayListOf(1, 2, 3, 4, 5)
    val listOfStrings = listOfNumbers.mapIt { ::transformToString }
    val listOfDoubledNumbers = listOfNumbers.mapIt { it -> it * 2 }

}