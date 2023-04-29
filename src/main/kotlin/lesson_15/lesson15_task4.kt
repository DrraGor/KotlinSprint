package lesson_15

fun main() {
    val guitar = MusicalInstrument("Гитара", 6)
    val strings = MusicalParts("Струны Defender af12", 20)
    guitar.search()
    strings.search()

}

class MusicalInstrument(val title: String, val quantity: Int) : Searchable

class MusicalParts(val title: String, val quantity: Int) : Searchable

interface Searchable {
    fun search() {
        println("Выполняется поиск")
    }
}