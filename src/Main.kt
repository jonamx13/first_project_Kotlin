fun main (args: Array<String>) {
    val lotteryNumbers = listOf(11,22,43,56,78,66)

    val numbersSorted = lotteryNumbers.sorted()
    println(numbersSorted)

    val descendantLotteryNumbers = lotteryNumbers.sortedDescending()
    println(descendantLotteryNumbers)

    val orderedByMultiples = lotteryNumbers.sortedBy { num -> num < 50 }
    println(orderedByMultiples)

    val randomNumbers = lotteryNumbers.shuffled()
    println(randomNumbers)

    val reversedNumbers = lotteryNumbers.reversed()
    println(reversedNumbers)

    val numberedMessages = lotteryNumbers.map { num ->
        "Your lottery number is $num"
    }
    println(numberedMessages)

    val filteredNumbers = lotteryNumbers.filter { num -> num % 2 == 0 }
    println(filteredNumbers)
}