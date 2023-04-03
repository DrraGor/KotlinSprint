package lesson_5

import java.time.LocalDate
import java.util.Scanner

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите год Вашего дня рождения:")
    val scanner = Scanner(System.`in`)
    val userAge = LocalDate.now().year - scanner.nextInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран приложения"

    println(resultText)

}