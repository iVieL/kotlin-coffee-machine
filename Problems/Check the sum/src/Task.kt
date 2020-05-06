import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val c1 = a + b == 20
    val c2 = b + c == 20
    val c3 = a + c == 20
    val cond = c1 || c2 || c3
    println(cond)
}
