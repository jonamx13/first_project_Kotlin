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

fun showAnswers() {
    println("Select an option:")
    println("1. Check all the answers")
    println("2. Check all the affirmative answers")
    println("3. Check all the doubtful answers")
    println("4. Check all the negative answers")

    val inputOption = readLine()
    when(inputOption) {
        "1" -> showAnswersByType()
        "2" -> showAnswersByType(answerType = AFFIRMATIVE_ANSWER)
        "3" -> showAnswersByType(answerType = DOUBTFUL_ANSWER)
        "4" -> showAnswersByType(answerType = NEGATIVE_ANSWER)
        else -> println("Non-valid answer... Goodbye.")
    }
}

fun showError() {
    println("Oh... that wasn't a valid choice... Does't matter... try again")
}

fun sayGoodbye() {
    println("Goodbye... or Farewell...")
}

fun showAnswersByType(answerType: String = "ALL") {
    val printAnswers: (String) -> Unit = { answerTypePrint ->
        answers.filterValues { answer ->
            answer == answerTypePrint
        }. also { answerValues -> println(answerValues.keys) }
    }
    when(answerType) {
        "ALL" -> answers.keys.forEach { answer -> println(answer) }

        AFFIRMATIVE_ANSWER -> printAnswers(AFFIRMATIVE_ANSWER)

        NEGATIVE_ANSWER -> printAnswers(NEGATIVE_ANSWER)

        DOUBTFUL_ANSWER -> printAnswers(DOUBTFUL_ANSWER)
    }
}

fun makeQuestion() {
    println("What's your question?")
    readLine()
    println("So that's your question... well, well... the answer is:")
    val generatedAnswer = answers.keys.random()
    println(generatedAnswer)

}