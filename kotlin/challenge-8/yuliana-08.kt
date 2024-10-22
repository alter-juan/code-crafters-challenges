val gifts = "76a11b"

fun parseGifts(): Map<Char, Int> {
    if (!gifts.matches(Regex("^\\d+[a-z](?:\\d+[a-z])*$"))) {
        println("Error: Formato de entrada inválido")
        return emptyMap()
    }

    val organizedGifts = mutableMapOf<Char, Int>()
    var currentNumber = ""

    for (char in gifts) {
        if (char.isDigit()) {
            currentNumber += char
        } else {
            organizedGifts[char] = currentNumber.toInt()
            currentNumber = ""
        }
    }

    return organizedGifts
}

fun organizeGifts(parsedGifts: Map<Char, Int>): String {
    var result = ""
    for ((letter, count) in parsedGifts) {
        result += organizeGiftType(letter, count)
    }
    return result
}

fun organizeGiftType(letter: Char, count: Int): String {
    val palets = count / 50
    val boxes = (count % 50) / 10
    val bags = count % 10

    val paletString = "[$letter]".repeat(palets)
    val boxString = "{$letter}".repeat(boxes)
    val bagString = if (bags > 0) "(${"$letter".repeat(bags)})" else ""

    return paletString + boxString + bagString
}

fun main() {
    val parsedGifts = parseGifts()
    if (parsedGifts.isNotEmpty()) {
        val result = organizeGifts(parsedGifts)
        println(result)
    }
    
}