package lesson_10

fun main() {

    fun rollTheDice(): Int {
        val diceOne = (1..6).random()
        val diceTwo = (1..6).random()
        println("Бросаем кости: выпало $diceOne и $diceTwo")
        return diceOne + diceTwo
    }

    println(
        """
            Добро пожаловать в игру в кости!
            Первый ходит человек""".trimIndent()
    )

    val playerScore = rollTheDice()
    println("Теперь бросает компьютер")

    val computerScore = rollTheDice()

    if (playerScore > computerScore) println("Победило человечество")
    else if (playerScore < computerScore) println("Человеки проиграли")
    else println("Ничья")


}