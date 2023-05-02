package lesson_18

fun main() {
    val animalsList = listOf(Cat(), Fox(), Dog())
    animalsList.forEach { it.animalPlay() }
    animalsList.forEach { it.animalEat() }
    animalsList.forEach { it.animalSleep() }
}

abstract class Animal(private val name: String) {
    abstract fun animalEat()
    fun animalSleep() {
        println("$name спит")
    }

    fun animalPlay() {
        println("$name играет")
    }
}

class Fox(name: String = "Лиса") : Animal(name) {
    override fun animalEat() {
        println("Лиса ест ягоды")
    }
}

class Dog(name: String = "Собака") : Animal(name) {
    override fun animalEat() {
        println("Собака ест кости ")
    }
}

class Cat(name: String = "Кошка") : Animal(name) {
    override fun animalEat() {
        println("Кошака ест рыбу")
    }
}