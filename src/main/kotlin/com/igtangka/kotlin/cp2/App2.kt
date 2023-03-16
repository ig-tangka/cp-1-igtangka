package com.igtangka.kotlin.cp2

fun main() {
    while (true) {
        val line = readLine() ?: break
        if (line == "0") break
        val sumEven = line.filterIndexed { index, _ -> index % 2 == 0 }.sumBy { it - '0' }
        val sumOdd = line.filterIndexed { index, _ -> index % 2 == 1 }.sumBy { it - '0' }
        val diff = sumEven - sumOdd
        if (diff % 11 == 0) {
            println("$line is a multiple of 11.")
        } else {
            println("$line is not a multiple of 11.")
        }
    }
}