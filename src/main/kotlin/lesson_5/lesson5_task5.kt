package lesson_5
import kotlin.random.Random

val FIRST_NUMBER_KS5 = Random(System.nanoTime()).nextInt(1, 100)
val SECOND_NUMBER_KS5 = Random(System.nanoTime()).nextInt(1, 100)
fun main() {
    println(
        """ 
       Добро пожаловать в розыгрыш лотереи
       что бы выиграть приз Вам нужно угадать два числа от 1 до 100!
       Введите первое число:
    """.trimIndent()
    )
    println("$FIRST_NUMBER_KS5, $SECOND_NUMBER_KS5")

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
