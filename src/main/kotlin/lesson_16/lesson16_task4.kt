package lesson_16

fun main() {
    val order = Order("в обработке", 122)
    requestToChangeStatus(order, "принят")
}

fun requestToChangeStatus(order: Order, status: String) {
    println("Отправлен запрос на изменение статуса заказа")
    order.changeStatus(status)
}

class Order(private var readiness: String, private val number: Int) {

    fun changeStatus(newStatus: String) {
        readiness = newStatus
        println("Статус заказа № $number изменён на $readiness")
    }

}