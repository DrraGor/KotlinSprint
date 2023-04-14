package lesson_9

fun main() {
    val arrayOfIngredients = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента № $i ")
        val incomeString = readln().lowercase()
        if (!arrayOfIngredients.contains(incomeString)) {
            arrayOfIngredients.add(incomeString)
        } else continue
    }
    println(arrayOfIngredients.sorted().joinToString(", ", "", ".")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() })

}