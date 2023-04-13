package com.igtangka.kotlin.cp4

import kotlin.math.pow

fun main() {
//    println("Enter the number of test cases:")
    var nCnt: Int = readLine()!!.toInt()

    if (nCnt < 0 || nCnt > 1000) {
        return
    }

    val results = mutableListOf<Pair<Int, Int>>()

    while (nCnt > 0) {
//        println("Enter a number to encrypt:")
        val input: Int = readLine()!!.toInt()

        if (input < 0 || input > 9999) {
            break
        }

        var nPl: Int = input
        var nHexCnt: Int = 0
        var nHexData: Int = 0

        while (nPl > 9) {
            var nQl: Int = nPl % 10
            nHexData += nQl * 16.0.pow(nHexCnt).toInt()
            nPl /= 10
            nHexCnt++
        }

        nHexData += nPl * 16.0.pow(nHexCnt).toInt()
        nPl = input
        var nBl: Int = 0

        while (nPl > 0) {
            var nQl: Int = nPl % 2
            nBl += nQl
            nPl /= 2
        }

        nPl = nHexData
        var nB2: Int = 0

        while (nPl > 0) {
            var nQl: Int = nPl % 2
            nB2 += nQl
            nPl /= 2
        }

        results.add(nBl to nB2)
        nCnt--
    }

//    println("Results:")
    results.forEach { (b1, b2) ->
        println("$b1 $b2")
    }
}