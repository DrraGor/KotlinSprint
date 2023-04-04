package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
const val MIN_TEENAGER_AGE = 16
const val MAX_TEENAGER_AGE = 17

fun main() {
    println("Введите год Вашего дня рождения:")

    val userAge = LocalDate.now().year - readLine()!!.toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == MIN_TEENAGER_AGE || userAge == MAX_TEENAGER_AGE) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран приложения"

    println(resultText)

}