package lesson_4

fun main() {

    val trainingDay = 5
    val trainingPossibility = trainingDay % 2 == 0
    println(
        """
              |Упражнения для рук:    ${trainingPossibility != true}
			  |Упражнения для ног:    ${trainingPossibility == true}
              |Упражнения для спины:  ${trainingPossibility == true}
			  |Упражнения для пресса: ${trainingPossibility != true}
		  """.trimMargin()
    )
}