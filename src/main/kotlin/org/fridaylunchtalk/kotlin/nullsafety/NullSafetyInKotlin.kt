package org.fridaylunchtalk.kotlin.nullsafety

/**
 * Example of code to prevent null-pointers in Kotlin.
 */
fun main(args: Array<String>) {

    val data = NestedData()
    println(data.nestedInnerData?.nestedInnerInnerData?.value?.toUpperCase() ?: "")

}