package lesson_9

fun main() {

    val arrayOfIngredients = arrayListOf("Мука", "Соль", "Яйцо", "Сахар", "Дрожжи")
    println("В рецепте есть следующие ингредиенты:$arrayOfIngredients")
    arrayOfIngredients.forEach { println(it) }
}

