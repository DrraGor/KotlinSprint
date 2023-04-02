package lesson_4

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    println("Average для груза с весом 20 кг и объемом 80 л: ${20 >= minAverageWeight && 20 <= maxAverageWeight && 80 < maxAverageVolume}")

    println("Average для груза с весом 50 кг и объемом 100 л: ${50 >= minAverageWeight && 50 <= maxAverageWeight && 100 < maxAverageVolume}")

}
