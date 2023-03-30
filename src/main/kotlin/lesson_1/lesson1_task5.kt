package lesson_1


fun main(){

    val flightInSeconds = 6480
    val flightInMinutes = flightInSeconds / 60

    print(String.format("%02d:%02d", flightInMinutes, flightInSeconds % 60))

}