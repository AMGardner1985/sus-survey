import { Component, OnInit } from '@angular/core';
import { SusSurvey } from './data/sus-survey';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-sus-survey-form',
  templateUrl: './sus-survey-form.component.html',
  styleUrls: ['./sus-survey-form.component.css']
})
export class SusSurveyFormComponent implements OnInit {

  constructor() { }

  originalSusSurvey : SusSurvey = {
    respondant: null,
    application: null,
    version: null,
    q1: null,
    q2: null,
    q3: null,
    q4: null,
    q5: null,
    q6: null,
    q7: null,
    q8: null,
    q9: null,
    q10: null
  };

  susSurvey : SusSurvey = { ...this.originalSusSurvey };

  ngOnInit() {
  }

  onSubmit(form : NgForm){
    console.log('in onSubmit: ', form.valid);
  }

}
