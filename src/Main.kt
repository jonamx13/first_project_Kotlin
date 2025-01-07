fun main (args: Array<String>) {
    val colors = listOf("Blue", "Yellow", "Red")
    with(colors) {
        println("These are our colors: $this")
        println("This list has a quantity of colors of $size")
    }
}
