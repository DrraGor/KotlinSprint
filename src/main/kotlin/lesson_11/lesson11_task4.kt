package lesson_11

fun main(){

    val userOne = Contact(
        "Приятель",
        "Victor",
        "Semenov",
        122,
        "8(999) 999-42-42",
        "8(999) 888-42-42",
        "mail@mail.ru"
    )

    val userTwo = Contact(
        "жена",
        "Валентина",
        "Петрова",
        278,
        "8(991) 349-24-00",
        "8(991) 458-44-01",
        "wife@mail.ru"
    )

    val userThree = Contact(
        "подруга",
        "Татьяна",
        "Рогова",
        8,
        "8(991) 229-55-00",
        "8(991) 558-44-01",
        "rogova@mail.ru"
    )

    userOne.printContactData()
    userOne.addToFavorites(userTwo)
    userOne.addToFavorites(userThree)
    userOne.printContactData()


}

class Contact(private val _contactName: String,
              private val _firstName: String,
              private val _secondName : String,
              private val _avatarImage : Int,
              private val _cellPhoneNumber : String,
              private val _homePhoneNumber : String,
              private val _emailAddress : String,
              private val _listOfFavorites: MutableList<Contact> = mutableListOf()
              ){


    fun addToFavorites(favoriteContact: Contact){
        _listOfFavorites.add(favoriteContact)

    }
    fun removeFromFavorites(){
    }

    fun addPhoneNumber(){
    }
    fun editPhoneNumber(){
    }

    fun addFirstName (){
    }
    fun editFirstName (){
    }

    fun addSecondName (){
    }
    fun editSecondName (){
    }

    fun addEmail(){
    }
    fun editEmail(){
    }


    fun sendMessage(){
    }

    fun makeCall(){
    }

    fun makeVideoCall(){
    }

    fun sendEmail(){
    }

    //Для тестирования
   fun printContactData() {
        println("$_contactName $_firstName $_secondName $_avatarImage \n$_cellPhoneNumber \n$_homePhoneNumber \n$_emailAddress")
        _listOfFavorites.forEach { println(it._contactName) }
    }

}