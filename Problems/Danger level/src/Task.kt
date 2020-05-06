enum class DangerLevel(aLevel: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    val innerLevel = aLevel

    fun getLevel(): Int {
        return innerLevel
    }
}

fun main1(args: Array<String>) {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel())
}