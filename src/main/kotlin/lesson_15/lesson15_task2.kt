package lesson_15

fun main() {
    val tempMessage = TemperatureMessage("Текущая температура 15 градусов")
    tempMessage.connect()
    tempMessage.sendMessage()
    println()

    val precipMessage = PrecipitationMessage("Осадки не ожидаются")
    precipMessage.connect()
    precipMessage.sendMessage()
}

abstract class BaseMessage(var message: String) {
    open fun connect() {
        println("Подключится к серверу")
    }

    abstract fun sendMessage()
}

class TemperatureMessage(message: String) : BaseMessage(message) {

    override fun connect() {
        println("Подключится к серверу")
    }

    override fun sendMessage() {
        println(message)
    }
}

class PrecipitationMessage(message: String) : BaseMessage(message) {
    override fun connect() {
        println("Подключится к серверу")
    }

    override fun sendMessage() {
        println(message)
    }
}

