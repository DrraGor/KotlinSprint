package lesson_11

fun main(){

    class User(
        val id: Int,
        val login: String,
        val password: String,
        val mail: String,
    )

    val userOne = User(7,"Mihail", "ctrhtn", "sdfff@mail.ru")
    val userTwo = User(8,"Stepan", "nfqyf", "werhan@mail.ru")

    println("Id = ${userOne.id}, login = ${userOne.login}, password = ${userOne.password}, mail = ${userOne.mail}")
    println("Id = ${userTwo.id}, login = ${userTwo.login}, password = ${userTwo.password}, mail = ${userTwo.mail}")

}