fun main (args: Array<String>) {
    val mobileList = mutableListOf("Google Pixel 2Xl", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .also {
            list -> println("The original value of the list is $list")
        }.asReversed()

    println(mobileList)
}
