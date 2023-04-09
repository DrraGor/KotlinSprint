package lesson_6

import kotlin.random.Random

fun main() {

    val secretNumber = Random.nextInt(1, 9)
    var attempts = 5
    println("Угадайте число от 1 до 9:")

    while (attempts > 0) {
        if (secretNumber == readln().toInt()) {
            println("Это была великолепная игра!")
        } else println("Не верно")
        attempts--
    }
    println("Было загадано число $secretNumber")

}