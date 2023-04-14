package lesson_10

fun main() {

    var playerTotalScore = 0
    var computerTotalScore = 0

    println("Добро пожаловать в игру в кости!")
    var roundCounter = 1
    do {
        val (pl, pc) = roundMaker(roundCounter)
        playerTotalScore += pl
        computerTotalScore += pc
        roundCounter++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().lowercase() == "да")

    println("Игра завершена")
    println("Человек выиграл $playerTotalScore раза, компьютер $computerTotalScore раза ")
}

fun rollTheDice(): Int {
    val diceOne = (1..6).random()
    val diceTwo = (1..6).random()
    println("Бросаем кости: выпало $diceOne и $diceTwo")
    return diceOne + diceTwo
}

fun roundMaker(roundCounter: Int): Pair<Int, Int> {
    var playerTotalScore = 0
    var computerTotalScore = 0
    val playerScore: Int
    val computerScore: Int
    if (roundCounter % 2 != 0) {
        println("Сейчас ваш ход")
        playerScore = rollTheDice()
        println("Сейчас ход компьютера")
        computerScore = rollTheDice()

        if (playerScore > computerScore) {
            println("Победило человечество")
            playerTotalScore++
        } else if (playerScore < computerScore) {
            println("Человеки проиграли")
            computerTotalScore++
        } else println("Ничья")

    } else {
        println("Сейчас ход компьютера")
        computerScore = rollTheDice()
        println("Сейчас ваш ход")
        playerScore = rollTheDice()

        if (playerScore > computerScore) {
            println("Победило человечество")
            playerTotalScore++
        } else if (playerScore < computerScore) {
            println("Человеки проиграли")
            computerTotalScore++
        } else println("Ничья")
    }
    return playerTotalScore to computerTotalScore
}