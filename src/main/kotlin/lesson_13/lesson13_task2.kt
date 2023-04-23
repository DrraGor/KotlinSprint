package lesson_13

class Contact(private val _name: String, private val _phone: Long, private val _company: String?) {
    fun printContact() {
        println(
            """
            Имя: $_name
            Номер: $_phone
            Компания: ${_company ?: "не указано"}
            """.trimIndent()
        )
    }
}

fun main() {

    val contact1 = Contact("Ростислав", 89123456789, null)
    contact1.printContact()

}