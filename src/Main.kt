fun main (args: Array<String>) {
    val mobileList = mutableListOf("Google Pixel 2Xl", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .apply { removeIf { mobile -> mobile.contains("Google")} }

    println(mobileList)

    val colors: MutableList<String>? = mutableListOf("Blue","Yellow","Red")
    colors?.apply {
        println("Our colors are: $this")
        println("The quantity of colors is: $size")
    }
}
