package lesson_5

const val USER_LOGIN = "Batman"
const val USER_PASSWORD = "password"


fun main() {
    println("Введите логин:")
    val userLogin = readln()
    if (userLogin == USER_LOGIN) {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD) println("Добро пожаловать $USER_LOGIN") else println("Неправильный пароль")
    } else println("Пользователь с таким логином не существует. Желаете зарегистритоваться?")

}