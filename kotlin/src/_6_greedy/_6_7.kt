package _6_greedy

import java.util.*
import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextDouble()
    val x = floor((sqrt(8 * n + 1) - 1) / 2).toInt()
    println(x)
    for (i in 1 until x) {
        print(i)
        print(" ")
    }
    print((n - x * (x - 1) / 2).toInt())

}