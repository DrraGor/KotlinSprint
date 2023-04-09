package lesson_7

fun main() {

    println("Введите число для начала отсчета")

    val borderOfCount = readLine()?.toInt() ?: 0
    for (i in borderOfCount downTo 1) {
        Thread.sleep(1000)
        println(i)
    }
    Thread.sleep(1000)
    println("Время вышло")
}