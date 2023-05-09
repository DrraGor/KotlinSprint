package lesson_17


fun main() {
    val parcel = Parcel(1, "Vitebsk")
    parcel.location = "Moskva"
    parcel.location = "Vologda"
    println(parcel.location)
    parcel.location = "Omsk"
    println(parcel.location)
    parcel.location = "Omsk"
    println(parcel.location)
    parcel.location = "Vologda"
    println(parcel.location)
    parcel.location = "Vologda"
    println(parcel.location)
}

class Parcel(val number: Int, _location: String) {

    private var forwarding = 0
        set(value) {
            field = value
            println("Счетчик: $field")
        }
    var location = _location
        set(value) {
            if (value != field) {
                field = value
                forwarding++
            } else field

        }

}
