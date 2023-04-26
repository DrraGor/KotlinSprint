package lesson_11

fun main() {

    val userOne = User112(7, "Mihail", "ctrhtn", "sdfff@mail.ru")
    userOne.addBio()
    userOne.passwordChanger()
    userOne.printUserInfo()
    println(userOne._bio)
    userOne.printUserText("${userOne._login} приветствую тебя!")

}

class User112(private val _id: Int, val _login: String, private var _password: String, private val _mail: String, var _bio: String = "") {

    init {
        println("Пользователь $_login создан")
    }

    fun printUserInfo() {
        println("Id = $_id, login = $_login, password = $_password, mail = $_mail,")
    }

    fun addBio() {
        println("Введите описание пользователя")
        _bio = readln()
    }

    fun passwordChanger() {
        var passwordWasChanged = false
        do {
            println("Введите пароль")
            if (readln() == _password) {
                println("Введите новый пароль")
                _password = readln()
                println("Пароль успешно изменён")
                passwordWasChanged = true
            } else println("Не верный пароль")
        } while (!passwordWasChanged)
    }

    fun printUserText(incomeText: String) {
        println(incomeText)
    }


}