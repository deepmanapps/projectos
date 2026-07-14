package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortSurveyAppl;
import io.deepmanapps.projectos.domain.port.out.WorkEffortSurveyApplRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortSurveyApplMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortSurveyApplJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSurveyApplRepositoryAdapter implements WorkEffortSurveyApplRepository {

    private final WorkEffortSurveyApplJpaRepository jpaRepository;
    private final WorkEffortSurveyApplMapper mapper;

    @Override
    public WorkEffortSurveyAppl save(WorkEffortSurveyAppl surveyAppl) {
        var entity = mapper.toEntity(surveyAppl);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
