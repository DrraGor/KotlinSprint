package lesson_11

fun main() {

    val userOne = User(7, "Mihail", "ctrhtn", "sdfff@mail.ru")
    userOne.addBio()
    userOne.passwordChanger()
    userOne.printUserInfo()
    println(userOne.bio)
    userOne.printUserText("${userOne._login} приветствую тебя!")

}

class User(val _id: Int, val _login: String, var _password: String, val _mail: String) {

    lateinit var bio: String
    init {
        println("Пользователь $_login создан")
    }

    fun printUserInfo() {
        println("Id = $_id, login = $_login, password = $_password, mail = $_mail,")
    }

    fun addBio() {
        println("Введите описание пользователя")
        bio = readln()
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

    fun printUserText(incomeText: String){
        println(incomeText)
    }


}