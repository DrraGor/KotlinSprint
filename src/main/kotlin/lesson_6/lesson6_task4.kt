package lesson_6

fun main() {

    val secretNumber = 7
    var attempts = 5
    println("Угадайте число от 1 до 10:")

    while (attempts > 0) {
        if (secretNumber == readln().toInt()) {
            println("Это была великолепная игра!")
        } else println("Не верно, попробуйте ещё раз")
        attempts--
    }
    println("Было загадано число $secretNumber")

}