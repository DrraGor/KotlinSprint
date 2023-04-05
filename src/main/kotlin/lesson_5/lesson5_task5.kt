package lesson_5
import kotlin.random.Random

val FIRST_NUMBER = Random(System.nanoTime()).nextInt(1, 100)
val SECOND_NUMBER = Random(System.nanoTime()).nextInt(1, 100)

fun main() {
    println(
        """ 
       Добро пожаловать в розыгрыш лотереи
       что бы выиграть приз Вам нужно угадать два числа от 1 до 100!
       Введите первое число:
    """.trimIndent()
    )
    println("$FIRST_NUMBER, $SECOND_NUMBER")

    val firstUserNumber = readln().toInt()
    println("Введите второе число:")
    val secondUserNumber = readln().toInt()
    if ((firstUserNumber == FIRST_NUMBER || firstUserNumber == SECOND_NUMBER) &&
        (secondUserNumber == FIRST_NUMBER || secondUserNumber == SECOND_NUMBER)
    ) println(
        """
        Поздравляем! Вы выиграли главный приз!
        Выигрышными номерами были $FIRST_NUMBER и $SECOND_NUMBER
        """.trimIndent()
    )
    else if ((firstUserNumber == FIRST_NUMBER || firstUserNumber == SECOND_NUMBER) ||
        (secondUserNumber == FIRST_NUMBER || secondUserNumber == SECOND_NUMBER)
    ) println(
        """
        Вы выиграли утешительный приз!
        Выигрышными номерами были $FIRST_NUMBER и $SECOND_NUMBER
        """.trimIndent()
    )
    else println(
        """
        Неудача! Крутите барабан!
        Выигрышными номерами были $FIRST_NUMBER и $SECOND_NUMBER
        """.trimIndent()
    )

}
