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
    open fun sendMessage() {
        println(message)
    }
}
class TemperatureMessage(message: String) : BaseMessage(message)

class PrecipitationMessage(message: String) : BaseMessage(message)

