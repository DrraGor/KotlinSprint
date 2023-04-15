package lesson_9

fun main() {
    val arrayOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента № $i ")
        val incomeString = readln().lowercase()
        arrayOfIngredients.add(incomeString)

    }
    println(arrayOfIngredients.sorted().joinToString(", ", "", ".")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() })

}