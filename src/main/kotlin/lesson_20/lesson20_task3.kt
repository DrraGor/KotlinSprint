package lesson_20

fun main() {
    val player = PlayerLesson203("Фёдор");
    val doorChecker =
        { it: PlayerLesson203 -> if (it.doorKey) println("Дверь открыта ключем") else println("Дверь заперта, найдите ключ") }
    doorChecker(player)
    println("${player.name} видит что то блестит в траве... это ключ")
    player.doorKey = true
    doorChecker(player)

}

class PlayerLesson203(val name: String, var doorKey: Boolean = false)
