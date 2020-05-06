import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val c1 = scanner.next()[0]
    val cond = c1.isUpperCase() || c1 in '1'..'9'
    println(cond)
}