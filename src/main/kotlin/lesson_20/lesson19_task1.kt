package lesson_20

fun main() {
    println("Вы можете добавить следующих рыб:")
    for (i in Fishes.values()) println(i)
}


enum class Fishes {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMES_FIGHTING_FISH

}