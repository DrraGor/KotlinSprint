package lesson_20

import java.util.*

fun main() {
    val robot = RobotLesson20()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
    robot.setModifier { it.uppercase(Locale.getDefault()) }
    robot.say()
    robot.setModifier { it }
    robot.say()
}

class RobotLesson20 {

    private val phrasesList = listOf(
        "Приветствую тебя человек, я робот помощник",
        "Что привело тебя в эти развалины",
        "Не мог бы ты поискать для меня аккумулятор",
        "Мой речевой модуль поврежден",
        "Вызовите технического специалиста для ремонта"
    )

    var lambdaForSayModifier = { text: String -> text }

    fun say() {

        println(lambdaForSayModifier(phrasesList.random()))
    }

    fun setModifier(lambda: (String) -> String) {
        lambdaForSayModifier = lambda

    }

}