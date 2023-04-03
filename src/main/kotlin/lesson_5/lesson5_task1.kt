package lesson_5

import java.util.Scanner

fun main() {
    println(
        """
        Для авторизации пройдите пожалуйста проверку
        Сложите пожалуйста два числа 7 и 3, ответ надо ввести в консоль:        
        """.trimIndent()
    )

    val scanner = Scanner(System.`in`)
    val result = scanner.nextInt()

    if (result == 10) println("Добро пожалвать!") else println("Доступ запрещён")

}
