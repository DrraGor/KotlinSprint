package lesson_4

import java.util.Scanner

const val RECOMMEND_TEAM_SIZE = 70
const val MINIMUM_TEAM_SIZE = 55
const val MINIMUM_PROVISION = 50

fun main() {
    val scanner = Scanner(System.`in`)

    println("Повреждён ли корпус корабля?")
    val corpusCondition = scanner.next() == "нет"
    println("Какова текущая численность экипажа?")
    val teamSize = scanner.nextInt()
    println("Какова текущая численность ящиков провизии?")
    val provision = scanner.nextInt()
    println("Благоприятные ли метеоусловия?")
    val weather = scanner.next() == "да"
    val permission =
        ((!corpusCondition && weather && teamSize == RECOMMEND_TEAM_SIZE && provision > MINIMUM_PROVISION) ||
          (corpusCondition && teamSize > MINIMUM_TEAM_SIZE && teamSize < RECOMMEND_TEAM_SIZE && provision > MINIMUM_PROVISION))

    println("Выход в море: $permission")

}
