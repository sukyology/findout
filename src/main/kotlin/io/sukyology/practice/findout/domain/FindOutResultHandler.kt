package io.sukyology.practice.findout.domain

object FindOutResultHandler {
    fun grade(survey: FindOutSurvey): FindOutTestResult {
        return when (val q = survey.getTheQuestion().chosenAnswer?.passage) {
            null -> throw Error("user must answer the question")
            "YES" -> FindOutTestResult(Player("John Stockton"))
            "MAYBE" -> FindOutTestResult(Player("any other player"))
            "WHAT THE HELL IS PASSING?" -> FindOutTestResult(Player("Kobe Bryant"))
            else -> throw Error("user must answer the question")
        }
    }

}
