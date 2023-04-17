package lesson_11

fun main() {
    //Создал комнаты
    val room1 = Room("Обложка Дерево", "разговоры о природе")
    val room2 = Room("Обложка Арфа", "разговоры о музыке")
    val room3 = Room("Обложка Танк", "для танкистов")
    val room4 = Room("Обложка Кот", "клуб любилетей котов")
    //Создал ленту комнат
    val roomsLent = listOf(room1, room2, room3, room4)
    //Заполнил её рандомно пользователями
    (0..3).forEach { i ->
        for (u in 0..(0..7).random()) roomsLent[i].addUser(generateUser())
    }
    //Показал комнаты и пользователей
    roomsLent.forEach { it.printRoomInfo() }

}

//Это герератор пользователей
fun generateUser(): ChatUser {
    val names = listOf("Степан", "Пётр", "Илья", "Ольга", "Екатерина", "Анастасия")
    return ChatUser((1..50).random(), names.random())
}

class Room(
    private val _cover: String,
    private val _nameOfRoom: String,
    private var _participantList: MutableList<ChatUser> = mutableListOf(),
) {

    fun addUser(user: ChatUser) {
        _participantList.add(user)
    }

    fun printRoomInfo() {
        println("$_cover, Комната - $_nameOfRoom, участники:")
        showUsers()
    }

    private fun showUsers() {
        _participantList.forEach { it.printUserInfo() }
    }

}

class ChatUser(private val _avatar: Int, private val _nickname: String) {

    private val userStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен").random()

    fun printUserInfo() {
        println("              Аватар-$_avatar, никнейм - $_nickname, статус - $userStatus")
    }


}