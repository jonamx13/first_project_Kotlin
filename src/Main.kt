fun main (args: Array<String>) {
    val initialValueLength = superFunction(initialValue = "Hello!") { value ->
        value.length
    }

    println(initialValueLength)

    val lambda: () -> String = inceptionFunction(name = "Jonathan")
    val lambdaValue: String = lambda()
    println(lambdaValue)
}

fun superFunction(initialValue: String, block: (String) -> Int) : Int {
    return block(initialValue)
}

fun inceptionFunction(name: String) : () -> String {
    return {
        "Hello from Lambda $name"
    }
}