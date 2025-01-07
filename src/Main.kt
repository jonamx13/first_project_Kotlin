//Setting answer values
const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//Joining the answers with their values
val answers = mapOf(
    "Yes" to AFFIRMATIVE_ANSWER,
    "It's true" to AFFIRMATIVE_ANSWER,
    "Totally" to AFFIRMATIVE_ANSWER,
    "Undoubtedly" to AFFIRMATIVE_ANSWER,
    "Ask in an other moment" to DOUBTFUL_ANSWER,
    "I can't say you in this moment" to DOUBTFUL_ANSWER,
    "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Do not count on it" to NEGATIVE_ANSWER,
    "Definitely not" to NEGATIVE_ANSWER,
    "I don't believe it" to NEGATIVE_ANSWER
)

fun main() {
    println("Hello, I am your 8 Magic Ball born out of Kotlin! What are we gonna do now?")
    println("1. Make a question")
    println("2. Check all the answers")
    println("3. Say \"Goodbye\"...")

    val inputValue = readLine()

    when(inputValue) {
        "1" -> makeQuestion()
        "2" -> showAnswers()
        "3" -> sayGoodbye()
        else -> showError()
    }
}