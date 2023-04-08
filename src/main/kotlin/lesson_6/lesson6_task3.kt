package lesson_6

fun main() {
    println("Введите количество секунд которые нужно отсчитать:")
    var countTime = readln().toInt()

    while (countTime > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $countTime")
        countTime--
    }
    println("Время вышло")
}
