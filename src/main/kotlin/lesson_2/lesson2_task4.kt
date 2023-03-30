package lesson_2

fun main(){
    val cristalOre = 7
    val ironOre = 11

    fun baf(ore: Int):Int {
        return (ore * 1.2 - ore).toInt()
    }
    println("Cristal ore with the baf ${baf(cristalOre)}")
    println("Iron ore with the baf ${baf(ironOre)}")

}