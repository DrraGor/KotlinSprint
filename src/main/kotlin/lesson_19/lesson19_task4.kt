package lesson_19

fun main() {
    val tank = Tank()
    tank.fire()
    tank.loadTheGun(Ammunition.BLUE)
    tank.fire()
    tank.loadTheGun(Ammunition.GREEN)
    tank.fire()
    tank.loadTheGun(Ammunition.RED)
    tank.fire()
}

enum class Ammunition(val damage: Int) {
    RED(20),
    BLUE(5),
    GREEN(10),
}

class Tank {
    private var currentAmmunition = 0

    fun loadTheGun(ammunition: Ammunition) {
        currentAmmunition = ammunition.damage
        println("Орудие заряжено боеприпасом \"${ammunition.name}\"")
    }

    fun fire() {
        if (currentAmmunition > 0) println("Бдыщь!!!! Нанесено $currentAmmunition единиц повреждений")
        else println("Орудие не заряжено")
    }

}
