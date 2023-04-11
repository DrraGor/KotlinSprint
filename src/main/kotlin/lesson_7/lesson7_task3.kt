package lesson_7

fun main() {

    println("Введите число для начала отсчета")
    val borderOfCount = readLine()?.toInt() ?: 0
    for (i in 0..borderOfCount step 2) println(i)
}