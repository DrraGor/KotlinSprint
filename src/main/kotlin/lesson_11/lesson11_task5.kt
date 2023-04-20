package lesson_11

fun main() {
    val forum = Forum()
    val user1 = forum.newUser(1, "Роман Петров", "qweee", "romanoff@mail.ru")
    val user2 = forum.newUser(1, "Логинова Ирина", "dlkjfsl", "log12@mail.ru", "Актриса оперы и балета")
    user1.printUserInfo()
    user2.printUserInfo()
    forum.newMessage(1000, "Роман Петров", "Доброе утро")
    forum.newMessage(1001, "Логинова Ирина", "Погода сегодня отличная")
    forum.newMessage(1000, "Роман Петров", "Вечером обещают дождь")
    forum.newMessage(1001, "Логинова Ирина", "Надеюсь прогноз не сбудется")

    println()
    forum.printThread()
}

interface UserInterface {
    fun printUserInfo()
}

class Forum {
    private var id = 10000
    private var historyOfMessages = mutableListOf<String>()
    private val factoryUser = User.Factory
    private val factorySimpleUser = UserSimple.Factory

    fun newUser(_id: Int, _login: String, _password: String, _mail: String, _bio: String): UserInterface {
        val user = factoryUser.buildUser()
        user.id = createUserId()
        user.login = _login
        user.password = _password
        user.mail = _mail
        user.bio = _bio
        return user
    }

    fun newUser(_id: Int, _login: String, _password: String, _mail: String): UserInterface {
        val user = factorySimpleUser.buildUser()
        user.id = createUserId()
        user.login = _login
        user.password = _password
        user.mail = _mail

        return user
    }

    private fun createUserId(): Int {
        return id++
    }

    fun newMessage(authorId: Int, login: String, message: String) {
        val newMessage = "$login: $message."
        historyOfMessages.add(newMessage)
        println(newMessage)
    }

    fun printThread() {
        historyOfMessages.forEach { println(it) }
    }

}


abstract class UserFactory {
    abstract fun buildUser(): UserInterface
}


class UserSimple(var id: Int, var login: String, var password: String, var mail: String) : UserInterface {

    companion object Factory : UserFactory() {
        override fun buildUser() = UserSimple(0, "Андреева Ольга", "fdfjh", "andreeva@mail.ru")
    }

    override fun printUserInfo() {
        println("Id = $id, login = $login, password = $password, mail = $mail")
    }
}

class User(var id: Int, var login: String, var password: String, var mail: String, var bio: String) :
    UserInterface {

    companion object Factory : UserFactory() {

        override fun buildUser() = User(0, "Пётр Сергеев", "qwerty", "sergeev@mail.ru", "")
    }


    override fun printUserInfo() {
        println("Id = $id, login = $login, password = $password, mail = $mail")
    }

    fun addBio() {
        println("Введите описание пользователя")
        bio = readln()
    }

    fun passwordChanger() {
        var passwordWasChanged = false
        do {
            println("Введите пароль")
            if (readln() == password) {
                println("Введите новый пароль")
                password = readln()
                println("Пароль успешно изменён")
                passwordWasChanged = true
            } else println("Не верный пароль")
        } while (!passwordWasChanged)
    }

    fun printUserText(incomeText: String) {
        println(incomeText)
    }

}
