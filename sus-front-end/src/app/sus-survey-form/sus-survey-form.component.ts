import { Component, OnInit } from '@angular/core';
import { SusSurvey } from './data/sus-survey';
import { NgForm } from '@angular/forms';
import { SusSurveyFormService } from './sus-survey-form.service';

@Component({
  selector: 'app-sus-survey-form',
  templateUrl: './sus-survey-form.component.html',
  styleUrls: ['./sus-survey-form.component.css']
})
export class SusSurveyFormComponent implements OnInit {

  constructor(private susSurveyFormService: SusSurveyFormService) { }
  

  originalSusSurvey : SusSurvey = {
    respondent: null,
    application: null,
    version: null,
    surveyDate: null,
    q1: null,
    q2: 1,
    q3: 1,
    q4: 1,
    q5: 1,
    q6: 1,
    q7: 1,
    q8: 1,
    q9: 1,
    q10: 1
  };

  susSurvey : SusSurvey = { ...this.originalSusSurvey };

  ngOnInit() {
  }

  setSurveyDate(){
    this.susSurvey.surveyDate = new Date();
  }

  onSubmit(form : NgForm){
    console.log('in onSubmit: ', form.valid);
    this.setSurveyDate();
    this.susSurveyFormService.postSusSurveyForm(this.susSurvey).subscribe(
      results => console.log('sucess: ', results),
      error => console.log('error: ', error)
    );
  }
}
