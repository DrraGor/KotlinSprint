package lesson_4

fun main() {

    val trainingDay = 5
    val trainingPossibility = trainingDay % 2 == 0
    println(
        """
              |Упражнения для рук:    ${!trainingPossibility}
			  |Упражнения для ног:    $trainingPossibility
              |Упражнения для спины:  $trainingPossibility
			  |Упражнения для пресса: ${!trainingPossibility}
		  """.trimMargin()
    )
}