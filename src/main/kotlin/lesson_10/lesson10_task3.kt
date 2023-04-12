package lesson_10

fun main() {

    val numbersSet = "0123456789"
    val symbolsSet = ";~@#$%^&*()_+=-№?.,/\"{'}()[]:!|"

    println("Укажите длинну генерируемого пароля")
    val passwordLength = readln().toInt()

    fun passwordGenerator(lengthOfPassword: Int):String {
        var generatedPassword = ""
        for (i in 1..lengthOfPassword) {
            generatedPassword += if(i % 2 == 0) numbersSet.random()
            else symbolsSet.random()
        }
        return generatedPassword
    }

    println(passwordGenerator(passwordLength))
}

