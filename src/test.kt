import kotlin.text.*

fun main() {
    println("Првиет мир, я заебался")

    var gg = Person("Чмоня")
    /*gg.showParameter()*/

    var goose = Person("Гусь", true, "Вредитель", "Жрать", "Тебя переживу", "Лопата в твоей жопе", true)

    /*goose.showParameter()*/

    println("\n")
    println("День: " + dayCount)


    println("1. Посмотреть внешние камеры")
    println("2. Проверить снаряжение")
    println("3. Послушать радио")
    println("\n")
    println("Введите число:")
    readChoose()

}

fun readChoose(){
    chooseString = (readln())
    chooseInt = chooseString.toIntOrNull()
    if(chooseInt == null) {
        println("Попробуйте ещё раз")
        readChoose()
    } else {
        println("krasava")
    }
}




var dayCount: Int = 1
var inventory = arrayOf("Пистолет", "Инатор", "", "", "")

var chooseString: String = "5"
var chooseInt: Int? = 0





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

