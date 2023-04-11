package lesson_9

fun main() {

    val arrayOfIngredients = mutableListOf(2,50,15)

    println("Сколько порций омлета вы хотите приготовить?")
    val portions = readln().toInt()
    val ingredientsOnPortions = arrayOfIngredients.map {
        it * portions
    }

    println(
        "На $portions порций вам понадобится: яиц – ${ingredientsOnPortions[0]}, молока – ${ingredientsOnPortions[1]
                    }, сливочного масла – ${ingredientsOnPortions[2]}"
    )
     ingredientsOnPortions.forEach { println(it) }

}

