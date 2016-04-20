package org.fridaylunchtalk.kotlin.nullsafety

/**
 * Created by Ingo on 20.04.2016.
 */
fun main(args: Array<String>) {

    val data = NestedData()
    println(data.nestedInnerData?.nestedInnerInnerData?.value?.toUpperCase() ?: "")

}