package com.gardner.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SusSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Pattern(regexp = "[a-zA-Z0-9]{7}", message = "standard id")
    private String respondent;

    private String application;

    private String version;

    private LocalDate surveyDate;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q1;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q2;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q3;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q4;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q5;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q6;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q7;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q8;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q9;

    @Min(value = 1, message = "minimum value of 1 for question")
    @Max(value = 5, message = "maximum value of 5 for question")
    private int q10;

    private double surveyScore;

    public void setSurveyScore() {
        surveyScore = 0;
        // each odd number question subtract 1 from score
        surveyScore = ((q1 - 1) + (q3 - 1) + (q5 - 1) + (q7 - 1) + (q9 - 1));
        // each even number subtract value from 5
        surveyScore += ((5 - q2) + (5 - q4) + (5 - q6) + (5 - q8) + (5 - q10));
        // take new total and multiply by 2.5
        surveyScore *= 2.5;
    }

    @PrePersist
    public void onCreate() {
        setSurveyScore();
    }

}
