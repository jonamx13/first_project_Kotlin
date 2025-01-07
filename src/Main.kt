fun main (args: Array<String>) {
    val mobileList = mutableListOf("Google Pixel 2Xl", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf{ mobile -> mobile.contains("Google")}
            this
        }

    println(mobileList)


}
