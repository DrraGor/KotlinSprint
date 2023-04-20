package lesson_12

fun main() {

    val weatherTrackerOne = WeatherTrack()
    weatherTrackerOne.printInfo("weatherTrackerOne")
    weatherTrackerOne.dayTimeTemperature = 19
    weatherTrackerOne.nightTimeTemperarure = 10
    weatherTrackerOne.happenedRain = true
    weatherTrackerOne.atmosphericPressure = 781
    weatherTrackerOne.printInfo("weatherTrackerOne")

    val weatherTrackerTwo = WeatherTrack()
    weatherTrackerTwo.printInfo("weatherTrackerTwo")
    weatherTrackerTwo.dayTimeTemperature = 3
    weatherTrackerTwo.nightTimeTemperarure = -5
    weatherTrackerTwo.happenedRain = false
    weatherTrackerTwo.atmosphericPressure = 750
    weatherTrackerTwo.printInfo("weatherTrackerTwo")

}

class  WeatherTrack (){
    var dayTimeTemperature : Int = 23
    var nightTimeTemperarure : Int = 15
    var happenedRain : Boolean = false
    var atmosphericPressure : Int = 769

    fun printInfo(name: String){
        println("""        
 Объект $name: Дневная температура - $dayTimeTemperature 
                           Ночная температура - $nightTimeTemperarure
                           Дождь - $happenedRain
                           Атмосферное давление - $atmosphericPressure        
        """)}

}