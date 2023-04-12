package lesson_10

fun main() {

    fun rollTheDice(): Int {
        val diceOne = (1..6).random()
        val diceTwo = (1..6).random()
        println("Бросаем кости: выпало $diceOne и $diceTwo")
        return diceOne + diceTwo
    }

    var playerTotalScore = 0
    var computerTotalScore = 0
    var roundCounter = 1
    var playerScore: Int
    var computerScore: Int


    fun roundMaker() {
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
        roundCounter++
    }

    println("Добро пожаловать в игру в кости!")
    roundMaker()
    println("Хотите бросить кости еще раз? Введите Да или Нет")

    while (readln().lowercase() == "да") roundMaker()

    println("Игра завершена")
    println("Человек выиграл $playerTotalScore раза, компьютер $computerTotalScore раза ")

}

