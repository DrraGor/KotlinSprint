package lesson_12

fun main() {

    val weatherTrackerOne = WeatherTrackTask2(19, 10, true, 781)
    weatherTrackerOne.printInfo("weatherTrackerOne")

    val weatherTrackerTwo = WeatherTrackTask2(3, -5, false, 750)
    weatherTrackerTwo.printInfo("weatherTrackerTwo")

    val weatherTrackThree = WeatherTrackTask2(16, 22, true, 790)
    weatherTrackThree.printInfo("weatherTrackThree")

}

class WeatherTrackTask2(
    _dayTimeTemperature: Int,
    _nightTimeTemperature: Int,
    _happenedRain: Boolean,
    _atmosphericPressure: Int,
) {

    private val dayTimeTemperature = _dayTimeTemperature
    private val nightTimeTemperature = _nightTimeTemperature
    private val happenedRain = _happenedRain
    private val atmosphericPressure = _atmosphericPressure

    fun printInfo(name: String) {
        println(
            """        
 Объект $name: Дневная температура - $dayTimeTemperature 
                           Ночная температура - $nightTimeTemperature
                           Дождь - $happenedRain
                           Атмосферное давление - $atmosphericPressure        
        """
        )
    }

}