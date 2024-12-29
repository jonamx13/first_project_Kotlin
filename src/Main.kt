fun main (args: Array<String>) {
    val fruitList: List<String> = listOf("Apple", "Pear", "Raspberry", "Peach")

    for (fruit in fruitList) println("Today I am gonna eat a fruit called \"$fruit\"")

    fruitList.forEach { fruit -> println("Fruit in forEach: \"$fruit\"") }

    val charsOfFruit: List<Int> = fruitList.map { fruit -> fruit.length }
    println(charsOfFruit)

    val filteredList = charsOfFruit.filter { charNum -> charNum > 4 }
    println(filteredList)
}