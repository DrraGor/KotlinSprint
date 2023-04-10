package lesson_8

fun main() {

    println("Сколько ингредиентов в вашем рецепте?")
    val ingredientsArray = arrayOfNulls<String>(readln().toInt())
    for (i in ingredientsArray.indices) {
        println("Введите название ингредиента № ${i + 1}:")
        ingredientsArray[i] = readln()
    }
    println("Ваш рецепт:")
    ingredientsArray.forEach { println(it) }
}