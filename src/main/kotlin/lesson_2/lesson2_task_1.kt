package lesson_2

import java.util.Locale

fun main() {
    val classGrades = arrayListOf(3, 4, 3, 5)
    println(String.format(Locale.GERMANY, "%.2f", classGrades.average()))
}