package lesson_14

fun main() {
    val planet = Planet(
        "Mars",
        true,
        true,
        true,
        true
    )
    planet.printName()

    val sputnik = Sputnik("Phobos")
    sputnik.printName()
    val sputnikTwo = Sputnik("Deimos")
    sputnikTwo.printName()

    val asteroid = Asteroid("Ceres")
    asteroid.printName()
}

abstract class AstronomicalObject {
    abstract val name: String
    abstract val habitability: Boolean
    abstract val atmosphere: Boolean
    abstract val water: Boolean
    abstract val disembarkation: Boolean
    abstract fun printName()
}

open class Planet(
    override val name: String,
    override val habitability: Boolean,
    override val atmosphere: Boolean,
    override val water: Boolean,
    override val disembarkation: Boolean,
) : AstronomicalObject() {

    override fun printName() {
        println(name)
    }
}

class Asteroid(

    override val name: String,
    override val habitability: Boolean = false,
    override val atmosphere: Boolean = false,
    override val water: Boolean = true,
    override val disembarkation: Boolean = true,
) : AstronomicalObject() {
    override fun printName() {
        println(name)
    }
}


class Sputnik(
    name: String,
    habitability: Boolean = false,
    atmosphere: Boolean = false,
    water: Boolean = false,
    disembarkation: Boolean = true,
) : Planet(
    name,
    habitability,
    atmosphere,
    water,
    disembarkation
)