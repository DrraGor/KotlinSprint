package lesson_11

fun main() {
    val forum = Forum()
    val user1 = forum.newUser("Роман Петров", "qweee", "romanoff@mail.ru")
    val user2 = forum.newUser("Логинова Ирина", "dlkjfsl", "log12@mail.ru", "Актриса оперы и балета")

    user1.printUserInfo()
    user2.printUserInfo()
    println()
    forum.newMessage(user1.getUserId(), user1.getUserLogin(), "Доброе утро")
    forum.newMessage(user2.getUserId(), user2.getUserLogin(), "Погода сегодня отличная")
    forum.newMessage(user1.getUserId(), user1.getUserLogin(), "Вечером обещают дождь")
    forum.newMessage(user2.getUserId(), user2.getUserLogin(), "Надеюсь прогноз не сбудется")
    println()
    println("Хронология сообщений")
    forum.printThread()
}

interface UserInterface {
    fun printUserInfo()
    fun getUserId(): Int
    fun getUserLogin(): String
}

class Forum {
    private var lastUserId = 0
    private var historyOfMessages = mutableListOf<String>()


    fun newUser(_login: String, _password: String, _mail: String, _bio: String): UserInterface {
        val userNew = User(lastUserId,_login, _password, _mail, _bio)
        lastUserId++
        return userNew
    }

    fun newUser(_login: String, _password: String, _mail: String): UserInterface {
        val userNew = UserSimple(lastUserId, _login, _password, _mail)
        lastUserId++
        return userNew
    }

    fun newMessage(authorId: Int, login: String, message: String) {
        val newMessage = "$authorId $login: $message."
        historyOfMessages.add(newMessage)
        println(newMessage)
    }

    fun printThread() {
        historyOfMessages.forEach { println(it) }
    }
}

class UserSimple(var id: Int = 0, var login: String, var password: String, var mail: String) : UserInterface {

    override fun printUserInfo() {
        println("Id = $id, login = $login, password = $password, mail = $mail")
    }

    override fun getUserId(): Int {
        return id
    }

    override fun getUserLogin(): String {
        return login
    }
}

class User(var id: Int = 0, var login: String, var password: String, var mail: String, var bio: String = "Без описания") :
    UserInterface {
    override fun printUserInfo() {
        println("Id = $id, login = $login, password = $password, mail = $mail, bio = $bio")
    }

    override fun getUserId(): Int {
        return id
    }

    override fun getUserLogin(): String {
        return login
    }

}
