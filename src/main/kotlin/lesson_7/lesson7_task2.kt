package lesson_7

import kotlin.random.Random

fun main() {

    var successAuthorization = false

    while (!successAuthorization) {
        val checkCode = Random(System.nanoTime()).nextInt(1000, 9999)
        println("Ваш код авторизации: N $checkCode")

        println("Введите проверочный код в консоль")

        if (readln().toInt() == checkCode) {
            println("Поздравляем, авторизация прошла успешно")
            successAuthorization = true

        } else println("Код не верный, вам отправлен новый код")
    }

}