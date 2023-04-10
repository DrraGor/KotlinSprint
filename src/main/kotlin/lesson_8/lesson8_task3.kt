package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Мука", "Соль", "Яйцо", "Сахар", "Дрожжи")
    println("Какой ингредиент Вы хотите найти?")
    val searchable = readln()
    if (arrayOfIngredients.contains(searchable)) println("Ингредиент $searchable в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}