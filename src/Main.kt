fun main (args: Array<String>) {
    val name = "Li"

    if(name.isNotEmpty()) println("The length of the variable \"name\" is ${name.length}") else println("Error, The variable is empty")

    val message : String = if (name.length > 3) {
        "Your name is long!"
    } else if (name.isEmpty()) {
        "Name is empty"
    }
    else {
        "You have a short name"
    }
    println(message)
}