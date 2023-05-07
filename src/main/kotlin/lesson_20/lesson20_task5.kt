package lesson_20


fun main() {
    val robot = RobotLesson20()
    println(robot.say())
    robot.setModifier { println(robot.say().reversed()) }
}

class RobotLesson20() {

    private val phrasesList = listOf(
        "Приветствую тебя человек, я робот помощник",
        "Что привело тебя в эти развалины",
        "Не мог бы ты поискать для меня аккумулятор",
        "Мой речевой модуль поврежден",
        "Вызовите технического специалиста для ремонта"
    )

    fun say(): String {
        return phrasesList.random()
    }

    fun setModifier(lambda: () -> Unit) {
        lambda()
    }
}
