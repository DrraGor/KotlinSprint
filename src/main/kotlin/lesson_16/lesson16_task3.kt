package lesson_16

fun main() {
    val user = TheUser("Carl", "secret")
    user.checkPassword("secret")
}

private class TheUser(val login: String, private val password: String) {

    fun checkPassword(incomepass: String) {
        if (incomepass == password) println("Пароль пользователя $login корректный")
        else println("Пароль пользователя $login не корректный")
    }
}