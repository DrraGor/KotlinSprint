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


enum class Ammunition {
    RED,
    BLUE,
    GREEN,
}

fun defineAmmunitionDamage(ammunition: Ammunition): Int {
    return when (ammunition) {
        Ammunition.RED -> 20
        Ammunition.GREEN -> 10
        Ammunition.BLUE -> 5
    }
}

class Tank {
    private var currentAmmunition = 0

    fun loadTheGun(ammunition: Ammunition) {
        currentAmmunition = defineAmmunitionDamage(ammunition)
        println("Орудие заряжено боеприпасом \"${ammunition.name}\"")
    }

    fun fire() {
        if (currentAmmunition > 0) println("Бдыщь!!!! Нанесено $currentAmmunition единиц повреждений")
        else println("Орудие не заряжено")
    }

}
