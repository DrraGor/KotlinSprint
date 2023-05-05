package lesson_20
/*В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
 Создай класс игрока (у него должно быть имя, текущее и максимальное здоровье).
  Затем напиши лямбда-функцию, реализующую лечебное зелье.
  Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.
 */

fun main() {
    val player = PlayerLesson20("Вениамин", 45, 200)
    player.playerStatus()
    println("О что это за красный пузырёк!?, Mмм вкусно!");
    { it: PlayerLesson20 -> it.currentHealth = it.maxHealth }(player)
    player.playerStatus()


}

class PlayerLesson20(val name: String, var currentHealth: Int, val maxHealth: Int) {
    fun playerStatus() {
        println("Игрок $name текущее здоровье $currentHealth из $maxHealth")
    }
}