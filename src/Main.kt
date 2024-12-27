// const variables are declares outside the entry point
const val PI = 3.1416

fun main() {
    println("Hello World!")
    var money : Int = 10
    println(money)
    money = 5
    println(money)
    val name : String =  "Mary"
    // name = "Antonium" // this cannot be done, because it is only read variable
    println(PI)

    val booleanVariable : Boolean = true
    val longNumber : Long = 3L
    val doubleNumber : Double = 2.87986
    val floatNumber : Float = 1.1f

    val firstValue = 20
    val secondValue = 12
    val thirdValue = firstValue.minus(secondValue)
    println(thirdValue)

    println(firstValue)
    println(secondValue)

    val lastName : String = "Meixueiro"
    val namePerson : String = "Jonathan"
    val completeName : String = "My full name is: $namePerson $lastName"

    println(completeName)

}