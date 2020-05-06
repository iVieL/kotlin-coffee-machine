import java.util.*

fun triangle(scanner: Scanner) {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val area = 0.25 * Math.sqrt(
            ((a + b + c) *
                    (-a + b + c) *
                    (a - b + c) *
                    (a + b - c)).toDouble()
    )

    println(area)
}

fun rectangle(scanner: Scanner) {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    println(a * b)
}

fun circle(scanner: Scanner) {
    val r = scanner.nextInt()
    println(3.14 * r * r)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.nextLine()) {
        "triangle" -> triangle(scanner)
        "rectangle" -> rectangle(scanner)
        "circle" -> circle(scanner)
    }
}