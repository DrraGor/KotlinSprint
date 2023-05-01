package lesson_18

fun main() {
    val dice4 = FourSideDice()
    val dice6 = SixSideDice()
    val dice8 = EightSideDice()

    dice4.throwTheDice()
    dice6.throwTheDice()
    dice8.throwTheDice()
}

abstract class BaseDice(private val sides: Int) {

    fun throwTheDice() {
        val dice = (1..sides).toList()
        println("Выпало: ${dice.random()}")
    }
}

class FourSideDice(sides: Int = 4) : BaseDice(sides)
class SixSideDice(sides: Int = 6) : BaseDice(sides)
class EightSideDice(sides: Int = 8) : BaseDice(sides)
