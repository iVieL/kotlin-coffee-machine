import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextLong()
    val ope = scanner.next()
    val b = scanner.nextLong()

    when (ope) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "/" -> {
            if (b == 0L) {
                println("Division by 0!")
            } else {
                println(a / b)
            }
        }
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}