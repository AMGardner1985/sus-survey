package com.gardner.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SusSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String respondent;
    private String application;
    private String version;
    private LocalDate surveyDate;
    private int q1;
    private int q2;
    private int q3;
    private int q4;
    private int q5;
    private int q6;
    private int q7;
    private int q8;
    private int q9;
    private int q10;
    private double surveyScore;

    public void setSurveyScore(){
        surveyScore = 0;
        // each odd number question subtract 1 from score
        surveyScore = ((q1 - 1) + (q3 -1 ) + (q5 -1) + (q7 -1) + (q9 -1));
        // each even number subtract value from 5
        surveyScore += ((5- q2) + (5- q4) + (5- q6) + (5- q8) + (5- q10));
        // take new total and multiply by 2.5
        surveyScore *= 2.5;
    }

}
