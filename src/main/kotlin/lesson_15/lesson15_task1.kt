package lesson_15

fun main() {
    val crucian = Crucian()
    println("Карась может:")
    crucian.startSwimming()
    crucian.stopSwimming()
    crucian.startDiving()
    crucian.stopDiving()
    println()

    val duck = Duck()
    println("Утка может:")
    duck.startSwimming()
    duck.stopSwimming()
    duck.startDiving()
    duck.stopDiving()
    duck.startWalk()
    duck.stopWalk()
    duck.startFly()
    duck.stopFly()
    println()

    val seagull = Seagull()
    println("Чайка может:")
    seagull.startSwimming()
    seagull.stopSwimming()
    seagull.startWalk()
    seagull.stopWalk()
    seagull.startFly()
    seagull.stopFly()

}

interface Floating {

    fun startSwimming() {
        println("Начать плаванье")
    }

    fun stopSwimming() {
        println("Перестать плыть")
    }

    fun startDiving() {
        println("Нырнуть")
    }

    fun stopDiving() {
        println("Вынырнуть")
    }
}

interface Movablee {

    fun startWalk() {
        println("Начать движение")
    }

    fun stopWalk() {
        println("Остановиться")
    }

}

interface Flyable {

    fun startFly() {
        println("Взлететь")
    }

    fun stopFly() {
        println("Приземлиться")
    }

}

class Crucian : Floating {

    override fun startSwimming() {
        println("Начать плаванье")
    }

    override fun stopSwimming() {
        println("Перестать плыть")
    }

    override fun startDiving() {
        println("Нырнуть")
    }

    override fun stopDiving() {
        println("Вынырнуть")
    }

}

class Duck : Floating, Flyable, Movablee {

    override fun startFly() {
        println("Взлететь")
    }

    override fun stopFly() {
        println("Приземлиться")
    }

    override fun startSwimming() {
        println("Начать плаванье")
    }

    override fun stopSwimming() {
        println("Перестать плыть")
    }

    override fun startDiving() {
        println("Нырнуть")
    }

    override fun stopDiving() {
        println("Вынырнуть")
    }

    override fun startWalk() {
        println("Начать движение")
    }

    override fun stopWalk() {
        println("Остановиться")
    }
}

class Seagull : Flyable, Movablee, Floating {

    override fun startFly() {
        println("Взлететь")
    }

    override fun stopFly() {
        println("Приземлиться")
    }

    override fun startSwimming() {
        println("Начать плаванье")
    }

    override fun stopSwimming() {
        println("Перестать плыть")
    }

    override fun startWalk() {
        println("Начать движение")
    }

    override fun stopWalk() {
        println("Остановиться")
    }
}

