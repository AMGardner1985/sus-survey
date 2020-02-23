import { Injectable } from '@angular/core';
import { SusSurvey } from './data/sus-survey';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SusSurveyFormService {

  constructor(private httpClient: HttpClient) { }

  url: string = 'http://localhost:8080/susSurveys';
  
  postSusSurveyForm(susSurvey: SusSurvey) : Observable<any> {
    return this.httpClient.post(this.url, susSurvey);
  }
}
