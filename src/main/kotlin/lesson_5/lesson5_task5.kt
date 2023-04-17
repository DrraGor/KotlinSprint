package lesson_5

val FIRST_NUMBER_KS5 = (1..100).random()
val SECOND_NUMBER_KS5 = (1..100).random()

fun main() {
    println(
        """ 
       Добро пожаловать в розыгрыш лотереи
       что бы выиграть приз Вам нужно угадать два числа от 1 до 100!
       Введите первое число:
    """.trimIndent()
    )
    val firstUserNumber = readln().toInt()
    println("Введите второе число:")
    val secondUserNumber = readln().toInt()
    if ((firstUserNumber == FIRST_NUMBER_KS5 || firstUserNumber == SECOND_NUMBER_KS5) &&
        (secondUserNumber == FIRST_NUMBER_KS5 || secondUserNumber == SECOND_NUMBER_KS5)
    ) println(
        """
        Поздравляем! Вы выиграли главный приз!
        Выигрышными номерами были $FIRST_NUMBER_KS5 и $SECOND_NUMBER_KS5
        """.trimIndent()
    )
    else if ((firstUserNumber == FIRST_NUMBER_KS5 || firstUserNumber == SECOND_NUMBER_KS5) ||
        (secondUserNumber == FIRST_NUMBER_KS5 || secondUserNumber == SECOND_NUMBER_KS5)
    ) println(
        """
        Вы выиграли утешительный приз!
        Выигрышными номерами были $FIRST_NUMBER_KS5 и $SECOND_NUMBER_KS5
        """.trimIndent()
    )
    else println(
        """
        Неудача! Крутите барабан!
        Выигрышными номерами были $FIRST_NUMBER_KS5 и $SECOND_NUMBER_KS5
        """.trimIndent()
    )
}