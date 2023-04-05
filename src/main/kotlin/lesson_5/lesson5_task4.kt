package lesson_5

const val USER_LOGIN_KS5_4 = "Batman"
const val USER_PASSWORD_KS5_4 = "password"

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    if (userLogin == USER_LOGIN_KS5_4) {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD_KS5_4) println("Добро пожаловать $USER_LOGIN_KS5_4") else println("Неправильный пароль")
    } else println("Пользователь с таким логином не существует. Желаете зарегистритоваться?")

}