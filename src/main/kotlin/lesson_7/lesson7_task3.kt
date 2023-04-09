package lesson_7

fun main() {

    println("Введите число для начала отсчета")

    val borderOfCount = readLine()?.toInt() ?: 0
    for (i in 0..borderOfCount) {
        if (i % 2 == 0) println(i) else continue

    }

}