package lesson_16

fun main() {
    val dice = Dice()
    dice.throwTheDice()
}

private class Dice {

    private val dice = (1..6).random()

    fun throwTheDice() {
        println("Выпало $dice")
    }
}
