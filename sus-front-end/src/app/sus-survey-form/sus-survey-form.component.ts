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


  originalSusSurvey: SusSurvey = {
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

  susSurvey: SusSurvey = { ...this.originalSusSurvey };

  postError: boolean = false;
  postErrorMessage: string = '';
  postSuccess: boolean = false;
  postSuccessMessage: string = '';
  

  ngOnInit() {
  }

  setSurveyDate() {
    this.susSurvey.surveyDate = new Date();
  }

  onSubmit(form: NgForm) {
    console.log('in onSubmit: ', form.valid);
    if (form.valid) {
      this.postError = false;
      this.setSurveyDate();
      this.susSurveyFormService.postSusSurveyForm(this.susSurvey).subscribe(
        results => this.onHttpSuccess(results),
        error => this.onHttpError(error)
      );
    } else {
      this.postError = true;  
      this.postErrorMessage = "Please be sure to include all required information and answer all questions."
    }
  }

  onHttpSuccess(resultsResponse: any){
    console.log('sucess: ', resultsResponse);
    this.postSuccess = true;
    this.postSuccessMessage = "Survey submitted successfully - (SUS) score of " + resultsResponse.surveyScore;
  }

  onHttpError(errorResponse: any) {
    console.log('error: ', errorResponse);
    this.postError = true;
    this.postErrorMessage = errorResponse.error.error + " - please try again later or contact technical support.";
  }
}
