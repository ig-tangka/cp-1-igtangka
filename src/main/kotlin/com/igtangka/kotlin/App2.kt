package com.igtangka.kotlin

import java.io.File

data class Answer(val number: Int, val choice: Char)

fun main() {
    val inputFile = File("testdata.in")
    val testCases = inputFile.readLines().mapIndexed { index, line ->
        if (index == 0) {
            // first line contains the number of test cases
            line.toInt()
        } else {
            // parse the test case inputs
            val (n, answers) = line.split(" ")
            val testCase = (1..n.toInt()).map { i ->
                val (number, choice) = answers.split(" ")[i - 1].split(".")
                Answer(number.toInt(), choice[0])
            }
            testCase
        }
    }

    testCases.forEachIndexed { i, testCase ->
        println("Case #${i + 1}:")
        testCase.sortedBy{it.number }.forEach {
            println("${it.number}. ${it.choice}")
        }
    }
}
