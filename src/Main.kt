fun main (args: Array<String>) {
    var name : String? = null

    try {
        throw NullPointerException("Null reference")
    } catch (exception : NullPointerException) {
        println("An error has happened")
    } finally {
        println("Finally, an error has happened... closing app")
    }

    val firstValue = 10
    val secondValue = 0
    val result : Int = try { firstValue / secondValue } catch (exception : Exception) { 0 }
    println(result)
}