package com.gardner.repository;

import com.gardner.model.SusSurvey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// TODO take out crossOrigin if goes to prod
@CrossOrigin
@RepositoryRestResource
public  interface SusSurveyRepository extends CrudRepository<SusSurvey, Long> {
}


