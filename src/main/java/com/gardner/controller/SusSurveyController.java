package com.gardner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SusSurveyController {


    @GetMapping(path = "/sus-survey")
    public String getSusSurveyResults(){
        return "hi";
    }
}
