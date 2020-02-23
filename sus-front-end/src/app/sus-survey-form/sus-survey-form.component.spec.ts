import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SusSurveyFormComponent } from './sus-survey-form.component';

describe('SusSurveyFormComponent', () => {
  let component: SusSurveyFormComponent;
  let fixture: ComponentFixture<SusSurveyFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SusSurveyFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SusSurveyFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
