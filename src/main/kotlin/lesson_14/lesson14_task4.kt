package lesson_14

fun main(){
    val planet = Planet(
        "Mars",
        true,
        true,
        true,
        true
    )
    planet.printName()

    val asteroid = Asteroid("Ceres")
    asteroid.printName()

    val sputnik = Sputnik("Phobos")
    sputnik.printName()
}

open class Planet(
    private val name: String,
    private val habitability: Boolean,
    private val atmosphere: Boolean,
    private val water: Boolean,
    private val disembarkation: Boolean,
) {

    open fun printName() {
        println(name)
    }
}

class Asteroid(
    name: String,
    habitability: Boolean = false,
    atmosphere: Boolean = false,
    water: Boolean = true,
    disembarkation: Boolean = true,
) : Planet(
    name,
    habitability,
    atmosphere,
    water,
    disembarkation
)

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