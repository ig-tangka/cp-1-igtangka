package com.igtangka.kotlin.cp2

fun main() {
    val T = readLine()!!.toInt()
    for (i in 1..T) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        var sum = 0
        for (j in a..b) {
            if (j % 2 != 0) {
                sum += j
            }
        }
        println("Case $i:$sum")
    }
}