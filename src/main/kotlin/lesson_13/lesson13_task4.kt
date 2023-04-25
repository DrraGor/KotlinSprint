package lesson_13

class PhoneContactLesson4(private val _name: String?, private val _phone: Long?, private val _company: String?) {
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

val contactList = mutableListOf<PhoneContactLesson4>()
fun main() {

    addContact()
    contactList.forEach { it.printContact() }
}

fun addContact() {
    var nextContact = true
    var phone: Long?
    do {
        println("Для добавления контакта введите его имя")
        val name = readlnOrNull()
        println("Введите номер телефона")

        phone = try {
            readLine()?.toLong()
        } catch (ex: NumberFormatException) {
            null
        }

        println("Введите название компании")
        val company = readlnOrNull()

        if (phone != null) contactList.add(PhoneContactLesson4(name, phone, company))
        else println("Номер телефона не введен, контакт не сохранен.")
        println("Если хотите добавить новую запись, введите \"да\"")


        if (readLine() != "да") nextContact = false
        else continue
    } while (nextContact)
}
