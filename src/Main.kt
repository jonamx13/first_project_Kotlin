fun main (args: Array<String>) {
    //immutable
    val namesList = listOf("Jhon", "Kike", "Camil")
    println(namesList)

    //mutable
    val emptyList = mutableListOf<String>()
    println(emptyList)

    emptyList.add("Jhonny")
    println(emptyList)

    val valueUsingGet = emptyList.get(0)
    println(valueUsingGet)

    val valueUsingOperator = emptyList[0]
    println(valueUsingOperator)

    val firstValue: String? = namesList.firstOrNull()
    println(firstValue)

    emptyList.removeAt(0)
    println(emptyList)

    emptyList.add("Charles")
    println(emptyList)

    emptyList.removeIf { chars -> chars.length > 3 }
    println(emptyList)

    val myArray = arrayOf(1,2,3,4)
    println("Our array $myArray")
    println("Array as list ${myArray.toList()}")
}