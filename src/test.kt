fun main() {
    println("Првиет мир, я заебался")

    var gg = Person("gg")


    gg.showParameter()
}

class Person() {

    var name: String = "Нпс"
    var infection: Boolean = false
    var profession: String = "Безработный"
    var hobby: String = "Отсутствует"
    var health: String = "Здоровый"
    var luggage: String = "Отсутствует"
    var alive: Boolean = true

    constructor(_name: String) : this() {
        name = _name
    }


    /*Эта функция показывает параметры персонажа.
    Чтобы вызвать написать: имя объекта.showParameter()*/
    fun showParameter(){
        println("Имя: $name")
        if("$infection" == "true"){
            println("Заражение: да")
        } else {
            println("Заражение: нет")
        }
        println("Профессия: $profession")
        println("Хобби: $hobby")
        println("Здоровье: $health")
        println("Багаж: $luggage")
        if("$alive" == "true"){
            println("Жив: да")
        } else {
            println("Жив: нет")
        }

    }
}

