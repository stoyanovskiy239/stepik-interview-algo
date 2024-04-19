package _6_greedy

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val d = scanner.nextInt()
    val m = scanner.nextInt()
    val n = scanner.nextInt()
    val s = MutableList(n + 2) { 0 }
    for (i in 1..n) {
        s[i] = scanner.nextInt()
    }
    s[n + 1] = d
    var k = 0
    var t = m
    var i = 0
    while (true) {
        t -= s[i + 1] - s[i]
        if (t < 0) {
            return println(-1)
        }
        if (++i == n + 1) {
            return println(k)
        } else if (s[i + 1] - s[i] > t) {
            t = m
            ++k
        }
    }
}