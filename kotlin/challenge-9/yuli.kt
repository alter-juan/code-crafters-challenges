val GREEN = "🟢"
val RED = "🔴"

fun calculateMovementsNeeded(lightsList: Array<String>, color: String): Int {
    var counter = 0

    for (i in lightsList.indices) {
        val expectedColor = if (i % 2 == 0) color else (if (color == RED) GREEN else RED)
        if (lightsList[i] != expectedColor) {
            counter++
        }
    }

    return counter
}

fun main() {
    val lightExample: Array<String> = arrayOf("🔴", "🔴", "🟢", "🟢", "🔴")

    val minimumRedMovements = calculateMovementsNeeded(lightExample, RED)
    val minimumGreenMovements = calculateMovementsNeeded(lightExample, GREEN)

    println(minOf(minimumRedMovements, minimumGreenMovements))
}
