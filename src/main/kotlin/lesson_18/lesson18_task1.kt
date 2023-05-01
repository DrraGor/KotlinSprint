package lesson_18

fun main() {
    val order1 = Orders(12, listOf("Перец", "Соль", "Морковь"))
    val ordre2 = SingleOrder(14,"Виноград")
    order1.getOrderInfo()
    println()
    ordre2.getOrderInfo()
}


abstract class SomeOrder(open val number: Int) {
    abstract fun getOrderInfo()
}

private class SingleOrder(override val number: Int, val product: String) : SomeOrder(number) {

    override fun getOrderInfo() {
        println("Заказ № $number  Заказан товар: \n$product")
    }
}


private class Orders(number: Int, val product: List<String>) : SomeOrder(number) {

    override fun getOrderInfo() {
        println("Заказ № $number  Заказаны товары:")
        product.forEach { println(it) }
    }

}
