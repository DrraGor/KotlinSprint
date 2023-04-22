fun main() {

    val weatherTrackerOne = DayWeatherTracker(19, 10,true, 781)
    weatherTrackerOne.printInfo("weatherTrackerOne")

    val weatherTrackerTwo = DayWeatherTracker(3,5,false,750)
    weatherTrackerTwo.printInfo("weatherTrackerTwo")

}

class DayWeatherTracker(
    private var dayTimeTemperature: Int,
    private var nightTimeTemperature: Int,
    private var happenedRain: Boolean = false,
    private var atmosphericPressure: Int,
) {

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

