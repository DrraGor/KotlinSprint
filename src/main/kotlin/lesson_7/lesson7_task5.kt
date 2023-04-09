package lesson_7

fun main() {

    val symbolsSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    println("Укажите длинну генерируемого пароля")
    val lengthGeneratedPass = readln().toInt()

    var generatedPassword = ""
    for (i in 1..lengthGeneratedPass) {
        generatedPassword += symbolsSet.random()

    }
    println(generatedPassword)
}