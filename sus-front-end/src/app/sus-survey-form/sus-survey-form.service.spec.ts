import { TestBed } from '@angular/core/testing';

import { SusSurveyFormService } from './sus-survey-form.service';

describe('SusSurveyFormService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SusSurveyFormService = TestBed.get(SusSurveyFormService);
    expect(service).toBeTruthy();
  });
});
