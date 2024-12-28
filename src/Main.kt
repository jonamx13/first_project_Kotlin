fun main (args: Array<String>) {
    var counter : Int = 10
    while (counter > 0) {
        println("Counter value is: $counter")
        counter--
    }

    do {
        println("Generating random number...")
        val randomNumber = (0..100).random()
        println("The generated number is: $randomNumber")
    } while (randomNumber > 50)
}