package lesson_5

const val USER_LOGIN_KS5_4 = "Batman"
const val USER_PASSWORD_KS5_4 = "password"

fun main() {
    println("Введите логин:")

    if (readln() == USER_LOGIN_KS5_4) {
        println("Введите пароль")
        if (readln() == USER_PASSWORD_KS5_4) println("Добро пожаловать $USER_LOGIN_KS5_4") else println("Неправильный пароль")
    } else println("Пользователь с таким логином не существует. Желаете зарегистритоваться?")
}

