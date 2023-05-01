package lesson_17

fun main() {
    val folder = Folder("Documents", 12, true)
    println(folder.name)
    folder.isSecretFlag = false
    println(folder.name)
}

class Folder(_name: String, val quantity: Int,  var isSecretFlag: Boolean) {

    var name = _name
        get() = if (isSecretFlag) "скрытая папка" else field

}