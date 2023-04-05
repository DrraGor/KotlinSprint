package lesson_4

const val RECOMMEND_TEAM_SIZE = 70
const val MINIMUM_TEAM_SIZE = 55
const val MINIMUM_PROVISION = 50

fun main() {


    println("Повреждён ли корпус корабля?")
    val corpusCondition = readln() == "нет"
    println("Какова текущая численность экипажа?")
    val teamSize = readln().toInt()
    println("Какова текущая численность ящиков провизии?")
    val provision = readln().toInt()
    println("Благоприятные ли метеоусловия?")
    val weather = readln() == "да"
    val permission =
        ((!corpusCondition && weather && teamSize == RECOMMEND_TEAM_SIZE && provision > MINIMUM_PROVISION) ||
                (corpusCondition && teamSize > MINIMUM_TEAM_SIZE && teamSize < RECOMMEND_TEAM_SIZE && provision > MINIMUM_PROVISION))

    println("Выход в море: $permission")

}
