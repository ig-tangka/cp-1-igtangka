package com.igtangka.kotlin.cp2

fun main() {
    while (true) {
        val (n, m) = readLine()?.split(" ")?.map { it.toInt() } ?: break
        var x = n
        var seq = mutableListOf<Int>()
        while (x != 1) {
            if (x % m != 0) {
                println("Boring!")
                break
            }
            seq.add(x)
            x /= m
        }
        if (x == 1) {
            seq.add(x)
            println(seq.joinToString(" "))
        }
    }
}