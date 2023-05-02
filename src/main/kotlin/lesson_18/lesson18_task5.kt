package lesson_18

fun main() {
    val screen = Screen()
    val circle = Circle18("Круг")
    screen.draw(circle, 22, 10)
    screen.draw(circle, 2.2f, 10)
    screen.draw(circle, 30, 100.5f)
    val square = Square18("Квадрат")
    screen.draw(square, 22, 80)
    screen.draw(square, 42.2f, 120)
    screen.draw(square, 30.0f, 10.5f)
    val dot = Dot18("Точка")
    screen.draw(dot, 202, 100)
    screen.draw(dot, 50.2f, 130)
    screen.draw(dot, 300, 40.5f)
}

abstract class AbstractFigure(val name: String) {

}

class Circle18(name: String) : AbstractFigure(name)
class Dot18(name: String) : AbstractFigure(name)
class Square18(name: String) : AbstractFigure(name)


class Screen() {

    fun draw(figure: AbstractFigure, x: Int, y: Int) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: AbstractFigure, x: Float, y: Float) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: AbstractFigure, x: Int, y: Float) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: AbstractFigure, x: Float, y: Int) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

}