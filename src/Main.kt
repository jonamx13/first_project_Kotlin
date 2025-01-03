fun main (args: Array<String>) {
    printName(name ="Jonathan", lastName ="Meixueiro", secondName = "Eduardo")
    printName(name ="Jonathan", lastName ="Meixueiro")
}

fun printName(name: String, secondName: String = "", lastName: String) {

    if (secondName != "") {
        println("My full name is \"$name $secondName $lastName\"")
    } else {
        println("My full name is \"$name $lastName\"")
    }
}