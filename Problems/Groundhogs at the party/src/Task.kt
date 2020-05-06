import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    val resp = weekend && cups >= 15 && cups <= 25 ||
            !weekend && cups >= 10 && cups <= 20
    println(resp)
}
