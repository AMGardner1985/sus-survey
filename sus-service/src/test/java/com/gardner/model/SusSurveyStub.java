package com.gardner.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SusSurveyStub {
    private static Map<Long, SusSurvey> surveys = new HashMap<>();
    private static Long idIndex = 3L;

    //populate initial surveys
    static {
        SusSurvey allFiveSurvey = SusSurvey.builder().q1(5).q2(5).q3(5).q4(5).q5(5).q6(5).q7(5).q8(5).q9(5).q10(5).build();
        surveys.put(1L, allFiveSurvey);
        SusSurvey bestPossibleSurvey = SusSurvey.builder().q1(5).q2(1).q3(5).q4(1).q5(5).q6(1).q7(5).q8(1).q9(5).q10(1).build();
        surveys.put(2L, bestPossibleSurvey);
        SusSurvey surveyThree = new SusSurvey();
        surveys.put(3L, surveyThree);
    }

    public static List<SusSurvey> getAll(){
        return new ArrayList<SusSurvey>(surveys.values());
    }

    public static SusSurvey get(Long id){
        return surveys.get(id);
    }

}
