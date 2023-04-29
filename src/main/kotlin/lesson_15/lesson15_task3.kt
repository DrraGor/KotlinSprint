package lesson_15

fun main(){
    val user = OrdinaryForumUser("Виталий")
    user.readForum()
    user.writeMessage()
    println()
    val admin = ForumAdministrator("Игорь")
    admin.readForum()
    admin.writeMessage()
    admin.deleteMessage()
}

abstract class ForumUser {

    abstract val userName: String
    abstract fun readForum()
    abstract fun writeMessage()

}

class OrdinaryForumUser(override val userName: String) : ForumUser() {

    override fun readForum() {
        println("Пользователь $userName читает сообщения")
    }

    override fun writeMessage() {
        println("Пользователь $userName пишет сообщение")
    }

}


class ForumAdministrator(override val userName: String) : ForumUser() {

    override fun readForum() {
        println("Администратов $userName читает сообщения")
    }

    override fun writeMessage() {
        println("Администратов $userName пишет сообщение")
    }

    fun deleteMessage() {
        println("Администратов $userName удаляет сообщение")
    }

}