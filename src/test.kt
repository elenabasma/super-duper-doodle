fun main() {
    println("Првиет мир, я заебался")

    var gg = Person("Чмоня")
    gg.showParameter()

    var goose = Person("Гусь", true, "Вредитель", "Жрать", "Тебя переживу", "Лопата в твоей жопе", true)
    goose.showParameter()
}

class Person(_name: String) {

    var name: String = _name
    var infection: Boolean = false
    var profession: String = "Безработный"
    var hobby: String = "Отсутствует"
    var health: String = "Здоровый"
    var luggage: String = "Отсутствует"
    var alive: Boolean = true

    constructor(_name: String, _infection: Boolean, _profession: String, _hobby: String, _health: String, _luggage: String, _alive: Boolean) : this(_name) {
        name = _name
        infection = _infection
        profession = _profession
        hobby = _hobby
        health = _health
        luggage = _luggage
        alive = _alive
    }


    /*Эта функция показывает параметры персонажа.
    Чтобы вызвать написать: имя объекта.showParameter()*/
    fun showParameter(){
        println("Имя: $name")
        if("$infection" == "true"){
            println("Заражение: Да")
        } else {
            println("Заражение: Нет")
        }
        println("Профессия: $profession")
        println("Хобби: $hobby")
        println("Здоровье: $health")
        println("Багаж: $luggage")
        if("$alive" == "true"){
            println("Жив: Да")
        } else {
            println("Жив: Нет")
        }

    }
}

