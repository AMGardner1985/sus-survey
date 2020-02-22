package com.gardner.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SusSurveyTest {

    @Test
    public void SusSurveyCanSetRespondentAppDateAndTenQuestions() {
        String respondent = "zkz3odx";
        String application = "test";
        String version = "test";
        int q1 = 1;
        int q2 = 1;
        int q3 = 1;
        int q4 = 1;
        int q5 = 1;
        int q6 = 1;
        int q7 = 1;
        int q8 = 1;
        int q9 = 1;
        int q10 = 1;
        SusSurvey susSurvey = SusSurvey.builder()
                .respondent(respondent)
                .application(application)
                .version(version)
                .q1(q1)
                .build();
        assertThat(susSurvey).isNotNull();
        assertThat(susSurvey.getId()).isNotNull();
    }

    @Test
    public void getSurveyScoreCanCalculateSusSurveyScore(){
        SusSurvey allFiveSurvey = SusSurveyStub.get(1L);
        double surveyScore = allFiveSurvey.getSurveyScore();
        assertThat(surveyScore).isGreaterThan(0);
    }

    @Test
    public void getSurveyScoreOfSurveyWithAll5ReturnsScoreOf50(){
        SusSurvey allFiveSurvey = SusSurveyStub.get(1L);
        allFiveSurvey.setSurveyScore();
        double surveyScore = allFiveSurvey.getSurveyScore();
        assertThat(surveyScore).isEqualTo(50);
    }

    @Test
    public void getSurveyScoreForBestPossibleSurveyReturns100(){
        SusSurvey bestPossibleSurvey = SusSurveyStub.get(2L);
        bestPossibleSurvey.setSurveyScore();
        double surveyScore = bestPossibleSurvey.getSurveyScore();
        assertThat(surveyScore).isEqualTo(100);
    }


}
