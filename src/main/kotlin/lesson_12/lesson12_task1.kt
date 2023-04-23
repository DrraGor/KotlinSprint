package lesson_12

fun main() {

    val weatherTrackerOne = WeatherTrack()
    weatherTrackerOne.printInfo("weatherTrackerOne")
    weatherTrackerOne.dayTimeTemperature = 19
    weatherTrackerOne.nightTimeTemperature = 10
    weatherTrackerOne.happenedRain = true
    weatherTrackerOne.atmosphericPressure = 781
    weatherTrackerOne.printInfo("weatherTrackerOne")

    val weatherTrackerTwo = WeatherTrack()
    weatherTrackerTwo.printInfo("weatherTrackerTwo")
    weatherTrackerTwo.dayTimeTemperature = 3
    weatherTrackerTwo.nightTimeTemperature = -5
    weatherTrackerTwo.happenedRain = false
    weatherTrackerTwo.atmosphericPressure = 750
    weatherTrackerTwo.printInfo("weatherTrackerTwo")
}

class WeatherTrack {
    var dayTimeTemperature = 23
    var nightTimeTemperature = 15
    var happenedRain = false
    var atmosphericPressure = 769

    fun printInfo(name: String) {
        println(
            """
                Объект $name: Дневная температура - $dayTimeTemperature 
                Ночная температура - $nightTimeTemperature
                Дождь - $happenedRain
                Атмосферное давление - $atmosphericPressure
                 
                """
                .trimIndent()
        )
    }

}