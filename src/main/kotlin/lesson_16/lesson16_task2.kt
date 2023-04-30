package lesson_16

fun main() {
    val circle = Circle(22)
    println(circle.calculateThePerimeter())
    println(circle.calculateTheSquare())
}

private class Circle(private val radius: Int) {

    private val pi = 3.14

    fun calculateTheSquare(): Double {
        return pi * (radius * radius).toDouble()
    }


    fun calculateThePerimeter(): Double {
        return 2 * pi * radius.toDouble()
    }

}

