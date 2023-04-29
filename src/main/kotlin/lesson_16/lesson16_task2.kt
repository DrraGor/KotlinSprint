package lesson_16

fun main() {
    val circle = Circle(22)
    println(circle.perimeter())
    println(circle.square())
}

private class Circle(private val radius: Int) {

    private val pi = 3.14

    fun square(): Double {
        return pi * (radius * radius).toDouble()
    }

    fun perimeter(): Double {
        return 2 * pi * radius.toDouble()
    }

}

