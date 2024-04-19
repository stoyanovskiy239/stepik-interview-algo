import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var W = scanner.nextInt()
    var C = 0.0
    val c = MutableList(n) { 0 }
    val w = MutableList(n) { 0 }
    val v = mutableListOf<Pair<Int, Double>>()
    for (i in 0 until n) {
        c[i] = scanner.nextInt()
        w[i] = scanner.nextInt()
        v.add(Pair(i, c[i].toDouble() / w[i]))
    }
    v.sortByDescending { it.second }
    for (x in v) {
        if (w[x.first] < W) {
            C += c[x.first]
            W -= w[x.first]
        } else {
            C += c[x.first] * W.toDouble() / w[x.first]
            break
        }
    }
    println(C)
}