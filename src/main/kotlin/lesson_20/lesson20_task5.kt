package lesson_20

fun main() {
    val robot = RobotLesson20()
    robot.say()
    robot.setModifier { robot.phrasesList.random().reversed() }
    robot.say()
    robot.setModifier { robot.phrasesList.random() }
    robot.say()
}

class RobotLesson20 {

    val phrasesList = listOf(
        "Приветствую тебя человек, я робот помощник",
        "Что привело тебя в эти развалины",
        "Не мог бы ты поискать для меня аккумулятор",
        "Мой речевой модуль поврежден",
        "Вызовите технического специалиста для ремонта"
    )
    var lambdaForSay = { phrasesList.random() }
    fun say() {
        println(lambdaForSay())

    }

    fun setModifier(lambda: () -> String) {
        lambdaForSay = lambda
    }
}

