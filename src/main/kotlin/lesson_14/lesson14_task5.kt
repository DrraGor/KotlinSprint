package lesson_14

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val figuresList = mutableListOf(
        Circle("red", 3),
        Circle("black", 7),
        Rectangle("green", 4, 3),
        Rectangle("black", 8, 5),
        Triangle("red", 7, 5, 10),
        Triangle("green", 12, 8, 8)
    )
    redPerimeters(figuresList)
    redSquare(figuresList)

}

fun redPerimeters(figures: MutableList<Figure>) {
    var redPer = 0.0
    for (i in figures) {
        if (i.color == "red") {
            redPer += i.perimeter()
        } else continue
    }
    println("Периметр красных фигур равен: $redPer")

}

fun redSquare(figures: MutableList<Figure>) {
    var redSquare = 0.0
    for (i in figures) {
        if (i.color == "red") {
            redSquare += i.square()

        } else continue
    }
    println("Площадь красных фигур равна: $redSquare")
}

abstract class Figure {
    abstract val color: String

    open fun square(): Double {

        return TODO("Provide the return value")
    }

    open fun perimeter(): Double {
        return TODO("Provide the return value")
    }
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