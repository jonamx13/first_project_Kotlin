fun main (args: Array<String>) {
    val myLambda: (String) -> Int = {value -> value.length}
    val executedLambda: Int = myLambda("Hello")
    println(executedLambda)

    val greetings = listOf("Hello", "Hola", "Privet", "Czesc", "Hallo", "Ola")
    val lengthGreetings_1 = greetings.map(myLambda)
    val lengthGreetings_2 = greetings.map {
        value -> value.length
    }

    println(lengthGreetings_1)
    println(lengthGreetings_2)
}