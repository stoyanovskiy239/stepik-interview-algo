package kt._6_greedy

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val p = MutableList(scanner.nextInt()) { Pair(scanner.nextInt(), scanner.nextInt()) }
    p.sortBy { it.second }
    val k = mutableListOf<Int>()
    k.add(p.first().second)
    for (x in p) {
        if (x.first > k.last()) {
            k.add(x.second)
        }
    }

    println(k.size)
    println(k.joinToString(" "))
}