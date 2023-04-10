package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Мука", "Соль", "Яйцо", "Сахар", "Дрожжи")
    var successChangeIngredient = false
    arrayOfIngredients.forEach { println(it) }
    while (!successChangeIngredient) {
        println("Какой ингредиент Вы хотите заменить?")
        val searchable = readln()

        if (arrayOfIngredients.contains(searchable)) {
            println("На что выхотите заменить $searchable")

            arrayOfIngredients[arrayOfIngredients.indexOf(searchable)] = readln()
            successChangeIngredient = true
            println("Готово! Вы сохранили следующий список:")
            arrayOfIngredients.forEach { println(it) }

        } else if (!successChangeIngredient) println("Такого ингредиента в рецепте нет")
    }
}