package lesson_6

fun main() {
    var counter = 0
    var rightDecision = false
    println("Для авторизации пройдите пожалуйста проверку")

    while (counter < 3) {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()

        println(
            "Сложите два числа $firstNumber и $secondNumber, ответ надо ввести в консоль:"
        )
        if (readln().toInt() == firstNumber + secondNumber) {
            rightDecision = true
            break

        } else println("Ответ не верный")
        counter++

    }
    if (rightDecision) println("Добро пожаловать!")
    else println("Доступ запрещён")

}