import kotlin.random.Random

val cardValues = mapOf(
    "As" to listOf(1, 11),
    "Dos" to 2,
    "Tres" to 3,
    "Cuatro" to 4,
    "Cinco" to 5,
    "Seis" to 6,
    "Siete" to 7,
    "Ocho" to 8,
    "Nueve" to 9,
    "Diez" to 10,
    "Jota" to 10,
    "Reina" to 10,
    "Rey" to 10
)

const val WIN_VALUE = 21

fun calculateHandValue(hand: List<String>): Int {
    var total = 0
    var aces = 0

    for (card in hand) {
        val value = cardValues[card]

        if (card == "As") {
            aces++
        }

        when (value) {
            is Int -> total += value
            is List<*> -> total += 11
        }
    }

    while (total > WIN_VALUE && aces > 0) {
        total -= 10
        aces--
    }

    return total
}

fun playComputerTurn(computerHand: MutableList<String>): String {
    while (calculateHandValue(computerHand) < 17) {
        val newCard = cardValues.keys.random()
        computerHand.add(newCard)
    }
    return getWinner(computerHand)
}

fun getWinner(computerHand: List<String>, userHand: List<String>? = null): String {
    val computerValue = calculateHandValue(computerHand)

    if (userHand == null) {
        return when {
            computerValue > WIN_VALUE -> "La computadora se pasó de 21. ¡Ganas!"
            computerValue in 17..WIN_VALUE -> "Cartas de la computadora: $computerHand. Valor: $computerValue"
            else -> "La computadora seguirá sacando cartas..."
        }
    }

    val userValue = calculateHandValue(userHand)

    return when {
        computerValue > WIN_VALUE -> "¡Ganas! La computadora se pasó de 21"
        userValue > WIN_VALUE -> "¡Perdiste! Te pasaste de 21"
        computerValue > userValue -> "¡Perdiste! La computadora tiene $computerValue y tú $userValue"
        computerValue < userValue -> "¡Ganaste! Tienes $userValue contra $computerValue de la computadora"
        else -> "¡Empate! Ambos tienen $userValue"
    }
}

fun playBlackjack(userHand: MutableList<String>, computerHand: MutableList<String>, isFirstTurn: Boolean = true): String {
    val userValue = calculateHandValue(userHand)

    if (isFirstTurn) {
        println("Tus cartas iniciales: $userHand. Valor: $userValue")

        if (userValue == WIN_VALUE) return "¡Blackjack! ¡Ganaste!"
    }

    if (userValue > WIN_VALUE) {
        println("Te pasaste de 21. ¡Perdiste!")
    }

    if (userValue == WIN_VALUE) {
        println("¡Tienes 21!")
        return playComputerTurn(computerHand)
    }

    println("Tienes $userValue. ¿Qué deseas hacer?")
    println("1. Pedir carta")
    println("0. Plantarse")

    return when (readln()) {
        "1" -> {
            val newCard = cardValues.keys.random()
            userHand.add(newCard)
            println("Has recibido: $newCard")
            playBlackjack(userHand, computerHand, false)
        }
        "0" -> playComputerTurn(computerHand)
        else -> {
            println("Opción no válida")
            playBlackjack(userHand, computerHand, false)
        }
    }
}

fun main() {
    println("Bienvenido al Blackjack")

    val userHand = mutableListOf(
        cardValues.keys.random(),
        cardValues.keys.random()
    )

    val computerHand = mutableListOf(
        cardValues.keys.random(),
        cardValues.keys.random()
    )

    println(playBlackjack(userHand, computerHand))
}
