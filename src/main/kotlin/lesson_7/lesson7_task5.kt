package lesson_7

fun main() {

    val lettersSet = ('a'..'z')
    val capitalLettersSet = ('A'..'Z')
    val numbersSet = (0..9)

    println("Укажите длинну генерируемого пароля")

    val lengthGeneratedPass = readln().toInt()
    val symbols = lettersSet + capitalLettersSet + numbersSet

    var generatedPassword = ""
    for (i in 1..lengthGeneratedPass) {
        generatedPassword += symbols.random()

    }
    println(generatedPassword)
}