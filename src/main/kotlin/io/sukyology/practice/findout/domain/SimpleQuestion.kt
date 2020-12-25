package io.sukyology.practice.findout.domain

class SimpleQuestion {

    var chosenAnswer: FindOutTestAnswer? = null
        private set

    fun possibleAnswers(): List<FindOutTestAnswer> {
        return listOf(
            FindOutTestAnswer(
                passage = "YES"
            ),
            FindOutTestAnswer(
                passage = "MAYBE"
            ),
            FindOutTestAnswer(
                passage = "WHAT THE HELL IS PASSING?"
            ),
        )
    }

    fun answers(findOutTestAnswer: FindOutTestAnswer) {
        chosenAnswer = findOutTestAnswer
    }

    val passage: String = "Do you think about passing the ball when you catch it?"
}
