package lesson_9

fun main() {

    val arrayOfIngredients: MutableList<String> = MutableList(51) { "" }
    arrayOfIngredients[2] = "яиц"
    arrayOfIngredients[50] = "молока"
    arrayOfIngredients[15] = "сливочного масла"

    println("Сколько порций омлета вы хотите приготовить?")
    val portions = readln().toInt()


    println(
        "На $portions порций вам понадобится: яиц – ${arrayOfIngredients.indexOf("яиц") * portions}, молока – ${
            arrayOfIngredients.indexOf("молока") * portions
        }, сливочного масла – ${arrayOfIngredients.indexOf("сливочного масла") * portions}"
    )
    arrayOfIngredients.add(readln())
    arrayOfIngredients.forEach { println(it) }

}

