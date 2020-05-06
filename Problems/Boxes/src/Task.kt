import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var x1 = scanner.nextInt()
    var y1 = scanner.nextInt()
    var z1 = scanner.nextInt()
    var x2 = scanner.nextInt()
    var y2 = scanner.nextInt()
    var z2 = scanner.nextInt()

    var temp: Int
    if (x1 > y1) {
        temp = x1
        x1 = y1
        y1 = temp
    }

//    var z1 = scanner.nextInt()
    if (z1 < y1) {
        temp = z1
        z1 = y1
        y1 = temp
        if (x1 > y1) {
            temp = x1
            x1 = y1
            y1 = temp
        }
    }

//    var x2 = scanner.nextInt()
//    var y2 = scanner.nextInt()
    if (x2 > y2) {
        temp = x2
        x2 = y2
        y2 = temp
    }

//    var z2 = scanner.nextInt()
    if (z2 < y2) {
        temp = z2
        z2 = y2
        y2 = temp
        if (x2 > y2) {
            temp = x2
            x2 = y2
            y2 = temp
        }
    }

    val capacity1 = x1 * y1 * z1
    val capacity2 = x2 * y2 * z2

    val validoGt = x1 >= x2 && y1 >= y2 && z1 >= z2
    val validoLt = x1 <= x2 && y1 <= y2 && z1 <= z2

    if (capacity1 == capacity2) {
        println("Box 1 = Box 2")
    } else if (capacity1 < capacity2 && validoLt) {
        println("Box 1 < Box 2")
    } else if (capacity1 > capacity2 && validoGt) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}
