package lesson_6

import kotlin.random.Random

fun main() {
    var counter = 0
    var rightDecision = false
    println("Для авторизации пройдите пожалуйста проверку")

    while (counter < 3) {

        val firstNumber = Random(System.nanoTime()).nextInt(1, 9)
        val secondNumber = Random(System.nanoTime()).nextInt(1, 9)

        println(
            """
            Сложите два числа $firstNumber и $secondNumber, ответ надо ввести в консоль:        
            """.trimIndent()
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