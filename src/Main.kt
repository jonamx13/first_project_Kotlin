fun main (args: Array<String>) {
    var name: String? = null

    name?.let {
        value -> println("Name is not null, it is \"$value \"")
    }

    name = "Jonathan"
    name?.let {
        value -> println("Name is not null, it is \"$value \"")
    }
}
