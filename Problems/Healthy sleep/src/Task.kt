import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    val h = scanner.next().toInt()

    if (h >= a && h <= b) {
        println("Normal")
    } else if (h < a) {
        println("Deficiency")
    } else {
        println("Excess")
    }
}
