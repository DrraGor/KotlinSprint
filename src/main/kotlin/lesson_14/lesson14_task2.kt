package lesson_14

fun main() {

    val iceBreaker = Icebreaker("Ермак", 15, 6000, 3)
    iceBreaker.breakingTheIce()
    iceBreaker.showSpeed()
    iceBreaker.showCapacity()
    println()
    val carrier = Carrier("Hercules", 25, 50000, 180)
    carrier.capacityContainersShow()
    carrier.showSpeed()
    carrier.showCapacity()

}

open class OrdinaryShip(val name: String, private val speed: Int, private val capacity: Int) {
    fun showSpeed() {
        println("Кораболь $name движется со скоростью $speed узлов")
    }

    fun showCapacity() {
        println("Кораболь $name вмещает $capacity ящиков груза")
    }
}

class Carrier(name: String, speed: Int, capacity: Int, private val container: Int) :
    OrdinaryShip(name, speed, capacity) {

    fun capacityContainersShow() {
        println("Грузовой кораль $name может перевозить до $container контейнеров")
    }
}


class Icebreaker(name: String, speed: Int, capacity: Int, private val icePermeability: Int) :
    OrdinaryShip(name, speed, capacity) {

    fun breakingTheIce() {
        println("Ледокол $name ломает лёд толщиной в $icePermeability метра")
    }
}
