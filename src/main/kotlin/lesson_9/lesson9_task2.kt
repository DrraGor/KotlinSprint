package lesson_9

import kotlin.system.exitProcess

fun main() {

    val arrayOfIngredients = arrayListOf("Мука", "Соль", "Яйцо")
    arrayOfIngredients.forEach { println(it) }
    println("В рецепте есть базовые ингредиенты:$arrayOfIngredients")
    println("Желаете добавить ещё?")
    if (readln() == "Да") {
        println("Какой ингредиент вы хотите добавить?")
        arrayOfIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:$arrayOfIngredients")
    } else {
        exitProcess(0)
    }

}

