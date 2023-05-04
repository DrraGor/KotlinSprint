package lesson_19

fun main() {
    val cartotec = Cartotec()
    cartotec.fillCartotec()
}

enum class Sex(name: String) {
    FEMALE("женщина"),
    MALE("мужчина"),
}

class SomePerson(val name: String, val sex: Sex)

class Cartotec {

    val personList = mutableListOf<SomePerson>()

    fun addPerson(person: SomePerson) {
        personList.add(person)
    }

    fun fillCartotec() {
        do {
            println("Введите имя человека")
            val name = readln()
            println("Введите пол человека, мужина/женщина")
            val sex = translateSexNaming(readln().lowercase())
            addPerson(SomePerson(name, sex))
        } while (personList.size < 5)
        personList.forEach { println("${it.name} ${it.sex.name}") }
    }
}

fun translateSexNaming(s: String): Sex {
    return if (s == "женщина") Sex.FEMALE
    else Sex.MALE
}