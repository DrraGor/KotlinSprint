package lesson_10

fun main() {

    val userLogin = checkLoginLength()
    val userPassword = generateParole()
    while (true) {

        println("Введите логин")
        if (readln() == userLogin) {
            println("Введите пароль")
            if (readln() == userPassword) {
                checkVerificationCode()
                println("Поздравляем, авторизация прошла успешно")
                break
            } else println("Неправильный пароль")
        } else println("Неправильный логин")
    }
}

fun checkVerificationCode() {

    do {
        var checkCode = (1000..9999).random()
        println("Ваш код авторизации: N $checkCode")
        println("Введите проверочный код в консоль")
        if (readln().toInt() != checkCode) {
            println("Код не верный, вам отправлен новый код")
            checkCode = (1000..9999).random()
            println("Ваш код авторизации: N $checkCode")
            println("Введите проверочный код в консоль")
        } else break
    } while (readln().toInt() != checkCode)
}

fun generateParole(): String {
    val lettersSet = ('a'..'z')
    val capitalLettersSet = ('A'..'Z')
    val numbersSet = (0..9)
    val symbols = lettersSet + capitalLettersSet + numbersSet

    var generatedPassword = ""
    for (i in 1..5) {
        generatedPassword += symbols.random()
    }
    println("Ваш пароль: $generatedPassword")
    return generatedPassword
}

fun checkLoginLength(): String {
    var userLogin: String
    do {
        println("Для регистрации введите логин:")
        userLogin = readln()
        if (userLogin.length < 4) println("Логин должен быть не менее четырёх знаков в длинну")

    } while (userLogin.length < 4)

    return userLogin
}

