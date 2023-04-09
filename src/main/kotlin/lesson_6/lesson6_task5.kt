package lesson_6

fun main() {
    var counter = 0
    var rightDecision = false
    println("Для авторизации пройдите пожалуйста проверку")
    val numbers = setOf<Int>(1,2,3,4,5,6,7,8,9)

    while (counter < 3) {
        val firstNumber = numbers.random()
        val secondNumber = numbers.random()

        println(
            """
            Сложите два числа $firstNumber и $secondNumber, ответ надо ввести в консоль:        
            """.trimIndent()
        )
        if (readln().toInt() == firstNumber + secondNumber) {
            rightDecision = true
            break

        } else println("Ответ не верный")
        counter++

    }
    if (rightDecision) println("Добро пожаловать!")
    else println("Доступ запрещён")

}