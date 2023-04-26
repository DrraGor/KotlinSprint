package lesson_14

val postsHistory = mutableListOf<ForumPost>()
fun main() {

    makePost()
    postsHistory.last().printPost()

    println("Хотите прокомментировать последнее сообщение?")
    if (readLine()?.lowercase() == "да") {
        makeComment()
        postsHistory.last().printPost()
    } else println("Всего хорошего")

}

fun makePost() {
    println("Для отправки сообщения представьтесь")
    val author = readLine() ?: "Инкогнито"
    println("Введите ваше собщение:")
    val text = readLine() ?: "Пустое сообщение"
    postsHistory.add(ForumPost(author, text))
}

fun makeComment() {
    println("Кто будет комментировать сообщение?")
    val author = readLine() ?: "Безымянный троль"
    println("Введите ваше собщение:")
    val text = readLine() ?: "Сообщение удалено"
    postsHistory.add(ForumPostComment(author, text, postsHistory.last()))
}

open class ForumPost(var author: String, var text: String) {

    open fun printPost() {
        println(
            """
                ...............................................                
                $text
                .....................................($author)
                """.trimIndent()
        )
    }
}

class ForumPostComment(author: String, text: String, private val _lastPost: ForumPost) : ForumPost(author, text) {

    override fun printPost() {

        _lastPost.printPost()
        println(
            """
                $text                
                ($author)......................................
                """.trimIndent()
        )
    }
}