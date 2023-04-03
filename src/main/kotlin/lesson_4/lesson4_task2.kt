package lesson_4

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    val cargo1Weight = 20
    val cargo1Volume = 80

    println("Average для груза с весом 20 кг и объемом 80 л: ${cargo1Weight >= minAverageWeight && cargo1Weight <= maxAverageWeight && cargo1Volume < maxAverageVolume}")

    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Average для груза с весом 50 кг и объемом 100 л: ${cargo2Weight >= minAverageWeight && cargo2Weight <= maxAverageWeight && cargo2Volume < maxAverageVolume}")

}
