package lesson_17

fun main() {
    val user = SomeUser("Василий", "secret")
    user.password = "не секретно"
    println(user.password)
    user.login = "Аркадий"
}

class SomeUser(private val _login: String, private val _password: String) {

    var password = _password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() = "*".repeat(field.length)


    var login = _login
        set(value) {
            println("Логин успешно изменён")
            field = value
        }

}
