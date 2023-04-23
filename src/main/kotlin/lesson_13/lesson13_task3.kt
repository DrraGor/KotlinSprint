package lesson_13

class PhoneContact(private val _name: String?, private val _phone: Long?, private val _company: String?) {
    fun printContact() {
        println(
            """
            Имя: ${_name ?: "не указано"}
            Номер: ${_phone ?: "не указано"}
            Компания: ${_company ?: "не указано"}
            """.trimIndent()
        )
    }
}

fun main() {
    val contactList = mutableListOf<PhoneContact>()
    val names = listOf("Степан", "Пётр", "Илья", "Ольга", "Екатерина", "Анастасия", null)
    val companies = listOf("Магнит", "Лента", "Пятёрочка", "Вкус вилл", "Дикси", "Спар", null)
    val numbers = listOf(89123456123, 89123456234, 89123456456, 89123456567, 89123456678, 89123456781, null)

    for (i in 1..7) {
        contactList.add(PhoneContact(names.random(), numbers.random(), companies.random()))
    }
    contactList.forEach { it.printContact() }
}