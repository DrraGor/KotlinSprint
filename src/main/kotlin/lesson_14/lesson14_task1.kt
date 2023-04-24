package lesson_14

fun main() {

    val ordinaryShip = Ship("Hercules", 25, 5000)
    ordinaryShip.showSpeed()
    ordinaryShip.showCapacity()
}

open class Ship(private val name: String, private val speed: Int, private val capacity: Int) {
    fun showSpeed() {
        println("Кораболь $name движется со скоростью $speed узлов")
    }

    fun showCapacity() {
        println("Кораболь $name вмещает $capacity ящиков груза")
    }

}

