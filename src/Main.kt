// const variables are declares outside the entry point
const val PI = 3.1416

fun printOperations(firstValue: Int, secondValue: Int) {
    // Print first and second numbers
    println("This is the first number: $firstValue")
    println("This is the second number: $secondValue")

    // List of operations
    val operationList: List<String> = listOf(
        "This is an addition operation: a: $firstValue + b: $secondValue c = a + b = ${firstValue + secondValue}",
        "This is a subtraction operation: a: $firstValue - b: $secondValue c = a - b = ${firstValue - secondValue}",
        "This is a multiplication operation: a: $firstValue * b: $secondValue c = a * b = ${firstValue * secondValue}",
        "This is a division operation: a: $firstValue / b: $secondValue c = a / b = ${firstValue / secondValue}",
        "This is a modulo operation: a: $firstValue % b: $secondValue c = a % b = ${firstValue % secondValue}",
        "This is a postfix increment operation: a: $firstValue++, b: $secondValue++",
        "This is a postfix decrement operation: a: $firstValue--, b: $secondValue--",
        "This is a greater than operation: a: $firstValue > b: $secondValue c = a > b = ${firstValue > secondValue}",
        "This is a less than operation: a: $firstValue < b: $secondValue c = a < b = ${firstValue < secondValue}",
        "This is a greater than or equal operation: a: $firstValue >= b: $secondValue c = a >= b = ${firstValue >= secondValue}",
        "This is a less than or equal operation: a: $firstValue <= b: $secondValue c = a <= b = ${firstValue <= secondValue}",
        "This is a not equal operation: a: $firstValue != b: $secondValue c = a != b = ${firstValue != secondValue}"
    )

    for (operation in operationList) {
        println(operation)
    }
}

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

    // Operators
    val firstNumber: Int = 40
    val secondNumber: Int = 17

    // Call the function to print all operations defined
    printOperations(firstNumber, secondNumber)
}