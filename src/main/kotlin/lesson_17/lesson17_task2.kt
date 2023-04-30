package lesson_17

fun main() {
    val ship = Ship("Varyag", 18, "Vladivostok")
    ship.name = "SPB"

}

class Ship(_name: String, var speed: Int, var homePort: String){

    var name: String = _name
        set(value) {
            println("Имя корабля изменить нельзя")

        }
}
