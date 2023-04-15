package lesson_10

fun main() {

    println("Введите логин")
    val login = readln()

    if (checkLength(login)) {
        println("Введите пароль")
        val pass = readln()
        if (checkLength(pass)) println("Регистрация прошла успешно")
        else println("Пароль недостаточно длинный")
    } else println("Логин недостаточно длинный")
}

fun checkLength(income: String): Boolean {
    return income.length >= 4
}
