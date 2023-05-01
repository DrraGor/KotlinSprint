package lesson_15

fun main() {
    val guitar = MusicalInstrument("Гитара", 6)
    val strings = MusicalParts("Струны Defender af12", 20)
    guitar.search()
    strings.search()

}
abstract class Product(val title: String, val quantity: Int)

class MusicalInstrument(title: String, quantity: Int) : Product(title, quantity), Searchable

class MusicalParts(title: String, quantity: Int) : Product(title, quantity), Searchable

interface Searchable {
    fun search() {
        println("Выполняется поиск")
    }
}