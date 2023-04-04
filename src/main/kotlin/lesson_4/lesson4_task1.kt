package lesson_4

const val TABLES = 13
fun main() {

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println(message = "Доступность столиков на сегодня: ${reservedTablesToday < TABLES}\nДоступность столиков на завтра: ${reservedTablesTomorrow < TABLES}")

}