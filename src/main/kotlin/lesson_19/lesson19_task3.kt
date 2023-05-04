package lesson_19

fun main() {
    val ship = StarShip()
    ship.startToFlight()
    ship.keepFiring()
    ship.lading()
}

class StarShip() {

    fun startToFlight() {
        println("Взлёт")
    }

    fun lading() {
        println("Вычисляем траекторию приземления")
        TODO()
    }

    fun keepFiring() {
        println("Piu piu")
        //TODO надо определить как будем наводить орудия
    }

}