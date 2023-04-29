package lesson_16

fun main() {
    val player = Player("Афанасий", 100, 300)
    println("Игрок ${player.name}, бой начался")
    while (player.curability) {

        Thread.sleep(500)
        player.incomeDamage((50..100).random())
        Thread.sleep(500)
        player.incomeHeal((10..30).random())
    }
}

private class Player(val name: String, var power: Int, private var _health: Int) {
    var curability = true
    private var health = _health

    private fun currentHealth() {
        println("Текущее здоровье: $health")
    }

    private fun death() {
        power = 0
        health = 0
        curability = false
        println("Игрок $name погиб")
    }

    fun incomeDamage(damage: Int) {
        if (damage < health) {
            health -= damage
            println("Получено повреждений -$damage")
            currentHealth()
        } else death()
    }

    fun incomeHeal(heal: Int) {
        val currentHealth = health
        if (curability) {
            if (currentHealth + heal < _health) {
                health += heal

            } else health = _health
            println("Восстановелно здоровья +$heal")
            currentHealth()
        }
    }
}