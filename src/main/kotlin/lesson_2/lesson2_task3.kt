package lesson_2

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457
    val timeInMinutes = (departureHours * 60 + departureMinutes + travelTime)

    println(String.format("%02d:%02d", (timeInMinutes / 60) % 24, timeInMinutes % 60))

}