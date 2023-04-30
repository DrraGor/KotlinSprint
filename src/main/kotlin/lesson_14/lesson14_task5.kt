package lesson_14

import kotlin.math.PI
import kotlin.math.sqrt

const val RED = "red"
const val GREEN = "black"
const val BLACK = "green"

fun main() {
    val figuresList = listOf(
        Circle(RED, 3),
        Circle(BLACK, 7),
        Rectangle(GREEN, 4, 3),
        Rectangle(BLACK, 8, 5),
        Triangle(RED, 7, 5, 10),
        Triangle(GREEN, 12, 8, 8)
    )
    calculateRedFigurePerimeters(figuresList)
    calculateRedFigureSquares(figuresList)


}

fun calculateRedFigurePerimeters(figures: List<Figure>) {
    var redPer = 0.0
    for (i in figures) {
        if (i.color == RED) {
            redPer += i.perimeter()
        } else continue
    }
    println("Периметр красных фигур равен: $redPer")

}

fun calculateRedFigureSquares(figures: List<Figure>) {
    var redSquare = 0.0
    for (i in figures) {
        if (i.color == RED) {
            redSquare += i.square()

        } else continue
    }
    println("Площадь красных фигур равна: $redSquare")
}

abstract class Figure {

    abstract val color: String
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Circle(
    override val color: String,
    private val radius: Int
) : Figure() {

    override fun square(): Double {

        return PI * (radius * radius).toDouble()
    }

    override fun perimeter(): Double {

        return 2 * PI * radius.toDouble()
    }
}
class Rectangle
    (
    override val color: String,
    private val length: Int,
    private val width: Int
) : Figure() {

    override fun square(): Double {

        return length * width.toDouble()
    }

    override fun perimeter(): Double {

        return (length * 2) + (width * 2).toDouble()
    }
}

class Triangle(
    override val color: String,
    private val sideA: Int,
    private val sideB: Int,
    private val sideC: Int
) : Figure() {
    private val per = (sideA + sideB + sideC) / 2

    override fun square(): Double {

        return sqrt(per * (per - sideA) * (per - sideB) * (per - sideC).toDouble())
    }

    override fun perimeter(): Double {

        return per * 2.toDouble()
    }
}