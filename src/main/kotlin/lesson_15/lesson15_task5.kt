package lesson_15

fun main() {
    val kamaz = CargoCar("Камаз")
    kamaz.startCargoTransportation(1000, 1)
    val volga = PassengerCar("Волга")
    volga.startPassengerTransportation(2)
    val moskvich = PassengerCar("Москвич")
    moskvich.startPassengerTransportation(3)
    val gaz = CargoCar("Газ")
    gaz.startCargoTransportation(1000, 0)

}

abstract class Car {
    abstract val name: String

}

interface CargoTransportation {
    fun startCargoTransportation(loadCargoCapacity: Int, loadPassengerCapacity: Int) {
        println("Перевезено $loadCargoCapacity килограмм груза и $loadPassengerCapacity пассажиров")
    }
}

interface PassengerTransportation {
    fun startPassengerTransportation(loadPassengerCapacity: Int) {
        println("Перевезено $loadPassengerCapacity пассажиров")
    }
}

class CargoCar(override val name: String) : Car(), CargoTransportation

class PassengerCar(override val name: String) : Car(), PassengerTransportation