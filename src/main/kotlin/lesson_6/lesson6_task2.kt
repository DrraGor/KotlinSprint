package lesson_6

fun main() {
    println("Введите количество секунд которые нужно отсчитать:")
    val countTime = readLine()!!.toInt()
    var counter = 1

    while (counter < countTime) {
        Thread.sleep(1000)
        println(counter)
        counter++
    }
    println("Прошло $countTime секунд.")

}
