package lesson_5

const val VERIFICATION_NUMBER = 10
fun main() {
    println(
        """
        Для авторизации пройдите пожалуйста проверку
        Сложите два числа 7 и 3, ответ надо ввести в консоль:        
        """.trimIndent()
    )

     val result = readln().toInt()

    if (result == VERIFICATION_NUMBER) println("Добро пожаловать!") else println("Доступ запрещён")

}
