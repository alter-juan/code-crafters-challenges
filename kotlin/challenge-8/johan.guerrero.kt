// Solución 1


fun splitString(gifts: String): Map<Char, Int> {
    val mappedGifts = mutableMapOf<Char, Int>()
    var currentNumber = ""

    for (char in gifts) {
        if (char.isDigit()) {
            currentNumber += char
        } else if (char.isLetter()) {
            mappedGifts[char] = currentNumber.toInt()
            currentNumber = ""
        }
    }

    return mappedGifts
}

fun organizeGifts(mappedGifts: Map<Char, Int>): String {
    var organizedGiftsResult = ""
    for (typeGift in mappedGifts) {
        val palletCount = typeGift.value / 50
        val boxCount = (typeGift.value % 50) / 10
        val leftoverGifts = typeGift.value % 10
        organizedGiftsResult += giftPackaging(palletCount, typeGift.key, '[', ']')
        organizedGiftsResult += giftPackaging(boxCount, typeGift.key, '{', '}')
        organizedGiftsResult += giftsBag(leftoverGifts, typeGift.key)
    }

    return organizedGiftsResult
}

fun giftPackaging(numberPackages: Int, typeGift: Char, symbolOpen: Char, symbolClose: Char): String {
    var giftPackResult = ""
    for (pack in 0 until numberPackages) {
        giftPackResult += "$symbolOpen$typeGift$symbolClose"
    }
    return giftPackResult
}

fun giftsBag(leftoverGifts: Int, typeGift: Char): String {
    var giftsBagResult = "("
    for (gift in 0 until leftoverGifts) {
        giftsBagResult += "$typeGift"
    }
    giftsBagResult += ")"
    return giftsBagResult
}

fun main() {
    val gifts = "76a11b"
    val mappedGifts = splitString(gifts)
    println(organizeGifts(mappedGifts))
}


// Solución optimizada

// fun splitString(gifts: String) = gifts.fold("" to mutableMapOf<Char, Int>()) { (num, map), char ->
//     if (char.isDigit()) num + char to map
//     else "" to map.apply { this[char] = num.toInt() }
// }.second

// fun organizeGifts(mappedGifts: Map<Char, Int>) = buildString {
//     mappedGifts.forEach { (type, count) ->
//         append("${repeatPackage(count / 50, type, '[', ']')}")
//         append("${repeatPackage((count % 50) / 10, type, '{', '}')}")
//         append("(${type.toString().repeat(count % 10)})")
//     }
// }

// fun repeatPackage(times: Int, type: Char, open: Char, close: Char) =
//     (1..times).joinToString("") { "$open$type$close" }

// fun main() {
//     val gifts = "76a11b"
//     println(organizeGifts(splitString(gifts)))
// }
