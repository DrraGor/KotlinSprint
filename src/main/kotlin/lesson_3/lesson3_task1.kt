package lesson_3

fun main() {
    val greeting = "Good afternoon, "
    val userName = "User"
    var userGreeting = "$greeting$userName!"

    println(userGreeting)

    userGreeting = "Good evening, $userName!"
    println(userGreeting)

    /* // Вариант с функцией
     val dayGreeting = "Good afternoon, "
     val eveningGreeting = "Good evening, "
     val userName = "User"

     fun printGreeting(greeting: String, name: String) {
         val userGreeting = greeting + name
         println(userGreeting)
     }
     printGreeting(dayGreeting, userName)
     printGreeting(eveningGreeting, userName)
 */
}