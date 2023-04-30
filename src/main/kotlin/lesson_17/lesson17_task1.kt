package lesson_17

class Quiz(_question: String, _answer: String) {

    var question = _question
        set(value: String) {
            field = value
        }

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }

}