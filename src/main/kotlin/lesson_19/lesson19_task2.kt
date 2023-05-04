package lesson_19

fun main(){
    val product1 = Products20("брюки", 1234, Category.CLOTHES)
    product1.printProductInfo()
    val product2 = Products20("арбалет", 1138, Category.DIFFERENT)
    product2.printProductInfo()
    val product3 = Products20("скрепки", 5534, Category.OFFICE_SUPPLIES)
    product3.printProductInfo()
}

enum class Category {
    CLOTHES,
    OFFICE_SUPPLIES,
    DIFFERENT,
}

class Products20(private val title: String, private val id: Int, private val category: Category) {

    fun printProductInfo() {
        println("Товар $title имеет идентификатор $id и относится к категории ${getCategoryDescription(category)}.")
    }

}

fun getCategoryDescription(category: Category): String {
    return when (category) {
        Category.CLOTHES -> "одежда"
        Category.OFFICE_SUPPLIES -> "канцелярские товары"
        Category.DIFFERENT -> "разное"
    }
}