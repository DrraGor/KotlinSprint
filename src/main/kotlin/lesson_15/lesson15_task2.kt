package lesson_15

fun main() {
    val tempMessage = TemperatureMessage()
    tempMessage.message = "Текущая температура 15 градусов"
    tempMessage.connect()
    tempMessage.sendMessage()
    println(tempMessage.message)
    println()

    val precipMessage = PrecipitationMessage()
    precipMessage.message = "Осадки не ожидаются"
    precipMessage.connect()
    precipMessage.sendMessage()
    println(precipMessage.message)
}

abstract class BaseMessage {

    abstract var message: String
    abstract fun connect()
    abstract fun sendMessage()
}

class TemperatureMessage : BaseMessage() {
    override var message = "Тестовое сообщение"

    override fun connect() {
        println("Подключится к серверу")
    }

    override fun sendMessage() {
        println("Отправить сообщение о температуре")
    }
}

class PrecipitationMessage : BaseMessage() {
    override var message = "Тестовое сообщение"

    override fun connect() {
        println("Подключится к серверу")
    }

    override fun sendMessage() {
        println("Отправить сообщение об осадках")
    }
}

