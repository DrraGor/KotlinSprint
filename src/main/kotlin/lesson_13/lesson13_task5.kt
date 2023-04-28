package lesson_13

fun main() {
    val number: Long
    val strNumber = readLine().toString()
    try {
        number = strNumber.toLong()
    } catch (_: NumberFormatException) {
        println("Номер может содержать только цифры")
    }
}