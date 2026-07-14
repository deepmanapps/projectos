package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Survey;
import io.deepmanapps.projectos.infrastructure.persistence.entity.SurveyJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class SurveyMapper {
    public Survey toDomain(SurveyJpaEntity entity) {
        if (entity == null) return null;
        return Survey.builder().surveyId(entity.getSurveyId()).build();
    }

    public SurveyJpaEntity toEntity(Survey domain) {
        if (domain == null) return null;
        SurveyJpaEntity entity = new SurveyJpaEntity();
        entity.setSurveyId(domain.getSurveyId());
        return entity;
    }
}
