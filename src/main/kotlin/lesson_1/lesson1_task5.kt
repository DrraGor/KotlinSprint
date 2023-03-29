package lesson_1


fun main(){
    val flightTimeInSeconds = 6480
    val flightInMinutes = flightTimeInSeconds / 60

    println("Время полета $flightInMinutes:${flightTimeInSeconds % 60}")
    //не могу сообразить как правильно сделать секунды 108:00
    //println("Время полета $flightInMinutes:00") это не серьёзно.

}