import java.util.*

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    println(MutableList(s.nextInt()) { s.nextInt().toString() }.sortedWith { x, y -> (y + x).toInt() - (x + y).toInt() }.joinToString(""))
}