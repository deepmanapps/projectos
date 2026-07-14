package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortSurveyAppl;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSurveyApplJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSurveyApplMapper {

    private final WorkEffortMapper workEffortMapper;
    private final SurveyMapper surveyMapper;

    public WorkEffortSurveyAppl toDomain(WorkEffortSurveyApplJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortSurveyAppl.builder()
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .survey(surveyMapper.toDomain(entity.getSurvey()))
                .build();
    }

    public WorkEffortSurveyApplJpaEntity toEntity(WorkEffortSurveyAppl domain) {
        if (domain == null) return null;
        WorkEffortSurveyApplJpaEntity entity = new WorkEffortSurveyApplJpaEntity();
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setSurvey(surveyMapper.toEntity(domain.getSurvey()));
        return entity;
    }
}
