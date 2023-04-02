package lesson_3

fun main() {
    val incomeMessage = "D2-D4;0"
    val from = incomeMessage.subSequence(0, 2)
    val where = incomeMessage.subSequence(3, 5)
    val strokeNumber = incomeMessage.substringAfterLast(';')

    println("Ход № $strokeNumber; $from - $where")

}
