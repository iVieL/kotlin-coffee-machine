import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val c1 = scanner.next()[0]
    val c2 = scanner.next()[0]
    val c3 = scanner.next()[0]
    val cond = c1 == c2 - 1 && c2 == c3 - 1
    println(cond)
}