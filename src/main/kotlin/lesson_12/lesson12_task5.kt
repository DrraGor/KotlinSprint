package lesson_12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val weatherTrackersList = mutableListOf<DayWeatherTrackerKS5>()
    for (i in 0..9) {
        weatherTrackersList.add(
            DayWeatherTrackerKS5(
                (-30..50).random(),
                (-40..25).random(),
                nextBoolean(),
                (700..900).random(),
            )
        )
    }
    var averageDaytimeTemperature = 0
    var averageNighttimeTemperature = 0
    var rainyDays = 0
    var averageAtmosphericPressure = 0

    for (i in weatherTrackersList) {
        averageDaytimeTemperature += i.dayTimeTemperature
        averageNighttimeTemperature += i.nightTimeTemperature
        averageAtmosphericPressure += i.atmosphericPressure
        if (i.happenedRain) rainyDays++
        else continue
    }
    println(
        """
            Средняя дневная температура: ${averageDaytimeTemperature / weatherTrackersList.size + 1}
            Средняя ночная температура: ${averageNighttimeTemperature / weatherTrackersList.size + 1}
            Дождливых дней: $rainyDays из ${weatherTrackersList.size} 
            Среднее атмосферное давление: ${averageAtmosphericPressure / weatherTrackersList.size + 1}
            """
            .trimIndent()
    )
}

class DayWeatherTrackerKS5(
    var dayTimeTemperature: Int,
    var nightTimeTemperature: Int,
    var happenedRain: Boolean = false,
    var atmosphericPressure: Int,
)




