package lesson_4

fun main() {

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val tables = 13
    println(message = "Доступность столиков на сегодня: ${reservedTablesToday < tables}\nДоступность столиков на завтра: ${reservedTablesTomorrow < tables}")

}