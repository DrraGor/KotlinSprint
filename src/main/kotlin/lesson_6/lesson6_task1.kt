package lesson_6

fun main() {

    var successfulRegistration = false

    println("Для регистрации введите логин:")

    val userLogin = readln()

    println("Введите пароль")

    val userPassword = readln()

    println(
        """
        Поздравляем, регистрация прошла успешно,
        для входа введите логин
        """.trimIndent()
    )

    if (readln() == userLogin) {

        while (!successfulRegistration) {
            println("Введите пароль")

            if (readln() == userPassword) {
                println("Авторизация прошла успешно")
                successfulRegistration = true

            } else println("Неправильный пароль")
        }
    } else println("Пользователь с таким логином не существует. Желаете зарегистритоваться?")

}
