package lesson_15

fun main() {
    val kamaz = CargoCar("Камаз")
    kamaz.startTransportation(kamaz.name)
    kamaz.startCargoTransportation(1000)
    println()
    val volga = PassengerCar("Волга")
    volga.startTransportation(volga.name)
    volga.startPassengerTransportation(2)
    println()
    val moskvich = PassengerCar("Москвич")
    moskvich.startTransportation(moskvich.name)
    moskvich.startPassengerTransportation(3)
    println()
    val gaz = CargoCar("Газ")
    gaz.startTransportation(gaz.name)
    gaz.startCargoTransportation(1000)

}

abstract class Car {
    abstract val name: String

}

interface Movable {
    fun startTransportation(name: String) {
        println("Движение $name начато")
    }

}

interface CargoTransportation {
    fun startCargoTransportation(loadCargoCapacity: Int) {
        println("Перевезено $loadCargoCapacity килограмм груза")
    }
}

interface PassengerTransportation {
    fun startPassengerTransportation(loadPassengerCapacity: Int) {
        println("Перевезено $loadPassengerCapacity пассажиров")
    }
}

class CargoCar(override val name: String) : Car(), Movable, CargoTransportation, PassengerTransportation

class PassengerCar(override val name: String) : Car(), Movable, PassengerTransportation