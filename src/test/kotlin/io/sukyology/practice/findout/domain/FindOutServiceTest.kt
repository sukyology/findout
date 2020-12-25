package io.sukyology.practice.findout.domain

import io.sukyology.practice.findout.domain.FindOutResultHandler.grade
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


@DisplayName("Given nba findout test to user")
internal class FindOutServiceTest {


    @Nested
    @DisplayName("when user finishes the test")
    inner class SimpleQuestionTest {



        @Test
        fun `then user is similar to kobe if he answers he does not consider passing`(){
            val survey = FindOutSurvey()
            val question : SimpleQuestion = survey.getTheQuestion()
            assertEquals("Do you think about passing the ball when you catch it?", question.passage )
            val possibleAnswers : List<FindOutTestAnswer> = question.possibleAnswers()
            assertEquals(3, possibleAnswers.size)
            assertEquals("YES", possibleAnswers[0].passage)
            assertEquals("MAYBE", possibleAnswers[1].passage)
            assertEquals("WHAT THE HELL IS PASSING?", possibleAnswers[2].passage)

            question.answers(possibleAnswers[2])

            val result: FindOutTestResult = grade(survey)
            val similarPlayer : Player = result.similarPlayer
            assertEquals("Kobe Bryant", similarPlayer.name)

        }
    }

}