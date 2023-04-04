package lesson_5

const val FIRST_NUMBER = 12
const val SECOND_NUMBER = 23

fun main() {
    println(
        """ 
       Добро пожаловать в розыгрыш лотереи
       что бы выиграть приз Вам нужно угадать два числа!
       Введите первое число:
    """.trimIndent()
    )
    val firstUserNumber = readln().toInt()
    println("Введите второе число:")
    val secondUserNumber = readln().toInt()
    if ((firstUserNumber == FIRST_NUMBER || firstUserNumber == SECOND_NUMBER) &&
        (secondUserNumber == FIRST_NUMBER || secondUserNumber == SECOND_NUMBER)
    ) println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstUserNumber == FIRST_NUMBER || firstUserNumber == SECOND_NUMBER) ||
        (secondUserNumber == FIRST_NUMBER || secondUserNumber == SECOND_NUMBER)
    ) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

}