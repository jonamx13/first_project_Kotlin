fun main (args: Array<String>) {
    val repeatedVocals = setOf("a","e","i","o","u","a","e","i","o","u")
    println(repeatedVocals)

    val favouriteNumbers = mutableSetOf(1,2,3,4)
    println(favouriteNumbers)
    favouriteNumbers.add(5)
    favouriteNumbers.add(5)
    println(favouriteNumbers)

    favouriteNumbers.remove(5)
    println(favouriteNumbers)

    val setValue: Int? = favouriteNumbers.firstOrNull { num -> num > 2 }
    println(setValue)
}