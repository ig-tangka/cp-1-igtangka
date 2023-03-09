/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.igtangka.kotlin

fun isPrime(x: Int, i: Int = 2): Boolean {
    if (x < 2)
        return false
    if (i * i > x)
        return true
    if (x % i == 0)
        return false
    return isPrime(x, i + 1)
}

fun main() {
    var h=1
    println("Jumlah angka yang akan dicek:")
    val t = readLine()!!.toInt()
    repeat(t) {
        println("Masukkan angka:")
        val x = readLine()!!.toInt()
        val result = if (isPrime(x)) "Prime Number" else "Not Prime Number"
        println("Angka ke-#${it+1}: $result")
    }
}


