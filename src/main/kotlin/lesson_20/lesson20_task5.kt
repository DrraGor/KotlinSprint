package lesson_20

fun main() {
    val robot = RobotLesson20()
    robot.say()
    robot.setModifier { it: String -> it.reversed() }
    robot.say()
    robot.say()
}

class RobotLesson20 {

    private val phrasesList = listOf(
        "Приветствую тебя человек, я робот помощник",
        "Что привело тебя в эти развалины",
        "Не мог бы ты поискать для меня аккумулятор",
        "Мой речевой модуль поврежден",
        "Вызовите технического специалиста для ремонта"
    )
    private var mod = false                              // флаг модификатора

    var lamBda = {s: String -> String}    // попытка создать переменную в которую потом запишется лямбда из setModifier (хрень)
        fun say() {                                      // Говорить должны через say т.к. у нас два режима пишу через if/else

        if (!mod) println( phrasesList.random())         // режим по умолчанию
        else lamBda(phrasesList.random())                // режим с включенным модификатором
    }


    fun setModifier(lambda: (String) -> String) {       // должны принять лямбду
        if (!mod) {                                     // модификатор не разовая штука поэтому ставлю флаг его включения
            mod = true
            println()
        } else mod = false
         lambda(phrasesList.random())                   //проверка лямбды, принимает стринг и его корректно обрабатывает
                                                        //как это транслировать в say  я понять не могу!!! HELP!!!
    }

}