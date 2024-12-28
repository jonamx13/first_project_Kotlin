fun main (args: Array<String>) {
    val colorName = "Red"

    when (colorName) {
        "Yellow" -> println("Yellow is the HAPPINESS color")
        "Red", "Crimson" -> println("This color symbolizes heat")
        else -> println("Error, I have no info about color")
    }

    val code : Int = 700

    when(code) {
        in 200..299 -> println("Everything is going right")
        in 400..500 -> println("Something has failed")
        else -> println("Unknown code, something has failed")
    }

    val shoesSize = 47
    val message = when(shoesSize) {
        41,43 -> "We have available shoes"
        42, 44 -> "We are running out of stock!"
        45 -> "Sorry, we don't have available stock"
        else -> "These shoes are only available for sizes: 41, 42, 43 & 45"
    }
    println(message)
}