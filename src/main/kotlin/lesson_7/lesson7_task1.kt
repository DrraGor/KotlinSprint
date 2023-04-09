package lesson_7

import kotlin.random.Random

fun main() {
    val symbolsSet = 'a'..'z'

    var password = ""

    fun generateRandomSymbol(position: Int): String {
        return if (position % 2 == 0) {
            (symbolsSet.random().toString())
        } else
            (Random(System.nanoTime()).nextInt(1, 9).toString())
    }
    for (i in 1..6) password += generateRandomSymbol(i)

    for (i in password) print(i)

}
