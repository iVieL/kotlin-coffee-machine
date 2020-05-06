import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var r = n / 10
    r *= 10
    val p = n - r
    println(p)
}