package lesson_12

fun main() {

    val weatherTrackerOne = DayWeatherTracker(19, 10, true, 781, "weatherTrackerOne")

    val weatherTrackerTwo = DayWeatherTracker(3, 5, false, 750, "weatherTrackerTwo")
}

class DayWeatherTracker(
    private var dayTimeTemperature: Int,
    private var nightTimeTemperature: Int,
    private var happenedRain: Boolean = false,
    private var atmosphericPressure: Int,
    private var _name: String = "",
) {
    init {
        printInfo()
    }

    private fun printInfo() {
        println(
            """
                Объект $_name: Дневная температура - $dayTimeTemperature
                Ночная температура - $nightTimeTemperature
                Дождь - $happenedRain
                Атмосферное давление - $atmosphericPressure
                
                """
                .trimIndent())
    }
}

