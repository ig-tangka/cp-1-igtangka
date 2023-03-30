package com.igtangka.kotlin.cp3

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    for (i in 1..t) {
        print("N = ")
        val n = scanner.nextInt()
        val matrix = Array(n) { IntArray(n) }

        for (j in 0 until n) {
            for (k in 0 until n) {
                matrix[j][k] = scanner.nextInt()
            }
        }

        var symmetric = true

        for (j in 0 until n) {
            for (k in 0 until n) {
                if (matrix[j][k] != matrix[n - j - 1][n - k - 1] || matrix[j][k] < 0) {
                    symmetric = false
                    break
                }
            }
            if (!symmetric) break
        }

        val result = if (symmetric) "Symmetric." else "Non-symmetric."
        println("Test #$i: $result")
    }
}