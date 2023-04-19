package lesson_5
fun main() {
    val firstNumber = (1..100).random()
    val secondNumber = (1..100).random()
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
    if ((firstUserNumber == firstNumber || firstUserNumber == secondNumber) &&
        (secondUserNumber == firstNumber || secondUserNumber == secondNumber)
    ) println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstUserNumber == firstNumber || firstUserNumber == secondNumber) ||
        (secondUserNumber == firstNumber || secondUserNumber == secondNumber)
    ) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println("Выигрышными номерами были $firstNumber и $secondNumber")

}