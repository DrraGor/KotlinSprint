package lesson_3

fun main() {

    var from = "E2"
    var where = "E4"
    var strokeNumber = 1
    var strokeMessage = "[$from-$where;$strokeNumber]"

    println(strokeMessage)

    from = "D2"
    where = "D3"
    strokeNumber += 1
    strokeMessage = "[$from-$where;$strokeNumber]"

    println(strokeMessage)

}