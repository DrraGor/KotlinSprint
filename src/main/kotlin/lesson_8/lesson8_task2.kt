package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Мука", "Соль", "Яйцо", "Сахар", "Дрожжи")
    println("Какой ингредиент Вы хотите найти?")
    val searchableIngredient = readln()
    var successSearchFlag = false
    for (i in arrayOfIngredients) {

        if (i == searchableIngredient) {
            println("Ингредиент $i в рецепте есть")
            successSearchFlag = true
            break
        }

    }
    if (!successSearchFlag) println("Такого ингредиента в рецепте нет")
}