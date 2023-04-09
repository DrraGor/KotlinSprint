package lesson_8

import kotlin.random.Random

fun main() {

    val weeklyViews = IntArray(7)
    for (i in weeklyViews) weeklyViews[i] = Random(System.nanoTime()).nextInt(0, 100)

    println(weeklyViews.sum())
}