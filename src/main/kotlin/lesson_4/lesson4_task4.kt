package lesson_4

fun main() {

    var trainingDay = 5

    println(
        """
              |Упражнения для рук:    ${trainingDay % 2 != 0}
			  |Упражнения для ног:    ${trainingDay % 2 == 0}
			  |Упражнения для спины:  ${trainingDay % 2 == 0}
			  |Упражнения для пресса: ${trainingDay % 2 != 0}
		  """.trimMargin()
    )
}