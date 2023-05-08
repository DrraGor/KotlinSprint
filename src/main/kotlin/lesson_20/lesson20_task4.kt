package lesson_20

fun main() {

    val someStringList = listOf("один", "два", "три", "четыре", "пять", "шесть")

    val printElement = { it: String -> "Нажат элемент $it" }

    val elementsMap = someStringList.map { printElement(it) }

    for ((index, value) in elementsMap.withIndex()) {
        if (index % 2 != 0) println(value)
    }

}