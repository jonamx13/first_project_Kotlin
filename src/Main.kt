fun main (args: Array<String>) {
    val randomPhrase = "This is a random phrase just to test a function 27092"

    val randomPhraseOrderedRandomly = randomCase(randomPhrase)
    println(randomPhraseOrderedRandomly)

    val zigzag = zigzagCasingPhrase(randomPhrase)

    println(zigzag)

    printPhrase(randomCase(randomPhrase))

    println("This is a test for extension \"String functions\": " +
            randomPhrase.randomCaseFun())
}

fun String.randomCaseFun () : String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()

    return if (randomResult.rem(2) == 0)
        this.uppercase() // toUpperCase is deprecated
        else
        this.lowercase() // toLowerCase is deprecated

}
fun randomCase (phrase : String) : String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()

    return if (randomResult.rem(2) == 0)
        phrase.uppercase() // toUpperCase is deprecated
        else
        phrase.lowercase() // toLowerCase is deprecated

}

fun zigzagCasingPhrase(phrase: String) : String {
    var switchUppercase = true
    return buildString {
        for( char in phrase ) {
            if (char != ' ') {
                append(
                    if (switchUppercase) char.uppercaseChar()
                    else char.lowercase()
                )
                switchUppercase = !switchUppercase
            } else {
                append(char)
            }
        }
    }
}

fun printPhrase(phrase : String) : Unit {
    println("Your phrase is: $phrase")
}