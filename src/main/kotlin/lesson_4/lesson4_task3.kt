package lesson_4

fun main() {

    val sunnyWeather = true
    val openedTent = true
    val humidity = 20
    val season = "Зима"

    val growingConditions = sunnyWeather && openedTent && humidity == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $growingConditions")

}
