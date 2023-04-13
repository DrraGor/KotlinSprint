package lesson_10
fun main() {

    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()
    lengthChecker(userLogin, userPassword)
}
fun lengthChecker(incomeLogin: String, incomePassword: String) {
    if (incomeLogin.length >= 4 && incomePassword.length >= 4) println("Регистрация прошла успешно")
    else println("Логин или пароль недостаточно длинные")
}
