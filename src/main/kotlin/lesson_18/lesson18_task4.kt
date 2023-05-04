package lesson_18

fun main() {
    val box1 = CubeBox(120)
    println(box1.calculateBoxArea())

    val box2 = RectangleBox(120, 120, 120)
    println(box2.calculateBoxArea())

}

abstract class SomeBox {

    abstract fun calculateBoxArea(): Int
}

class CubeBox(private val sideLength: Int) : SomeBox() {

    override fun calculateBoxArea(): Int {
        return (sideLength * sideLength) * 6
    }
}

class RectangleBox(private val length: Int, private val width: Int, private val height: Int) : SomeBox() {

    override fun calculateBoxArea(): Int {
        return (((length * height) * 2) + ((height * width) * 2) + ((length * width) * 2))
    }
}