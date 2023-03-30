package lesson_2

fun main(){
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457

    fun timeSecondsToStr(minutes: Int): String {
        val hours = minutes / 60 + departureHour
        val remМinutes = minutes % 60 + departureMinutes
        val totalHours = (remМinutes / 60) + hours
        val totalMinutes = (remМinutes % 60)
        return String.format("%02d:%02d",  totalHours, totalMinutes)
    }

    println(timeSecondsToStr(travelTime))

}
