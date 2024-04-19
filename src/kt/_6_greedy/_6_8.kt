package kt._6_greedy

import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    println(MutableList(s.nextInt()) { s.nextInt().toString() }.sortedWith { x, y -> (y + x).toInt() - (x + y).toInt() }.joinToString(""))
}