package lesson_9

fun main() {

    println("Введите ингредиенты вашего рецепта, через запятую")
    val incomeString = readln()
    val arrayOfIngredients = incomeString.lowercase().replace(" ", "").split(',')

    println(arrayOfIngredients.sorted())

}