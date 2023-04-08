package lesson_7

import kotlin.random.Random

fun main() {
    val symbolsSet = setOf(
        'a',
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j',
        'k',
        'l',
        'm',
        'n',
        'o',
        'p',
        'q',
        'r',
        's',
        't',
        'u',
        'v',
        'w',
        'x',
        'y',
        'z'
    )
    var password = ""

    fun charGenerator(position: Int): String {
        return if (position % 2 == 0) {
            (symbolsSet.random().toString())
        } else
            (Random(System.nanoTime()).nextInt(1, 9).toString())
    }
    for (i in 1..6) password += charGenerator(i)

    for (i in password) print(i)

}
