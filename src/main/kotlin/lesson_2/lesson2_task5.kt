package lesson_2
import java.util.*
import kotlin.math.pow

fun main() {

    val initSum = 70000
    val percent = 16.7
    val sumWithPercent = initSum * (1 + percent / 100.toDouble()).pow(20)
    println(String.format(Locale.US,"%.3f", sumWithPercent)+ ".")

}