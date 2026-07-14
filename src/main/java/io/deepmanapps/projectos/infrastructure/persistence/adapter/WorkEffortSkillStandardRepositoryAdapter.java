package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortSkillStandard;
import io.deepmanapps.projectos.domain.port.out.WorkEffortSkillStandardRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortSkillStandardMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortSkillStandardJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSkillStandardRepositoryAdapter implements WorkEffortSkillStandardRepository {

    private final WorkEffortSkillStandardJpaRepository jpaRepository;
    private final WorkEffortSkillStandardMapper mapper;

    @Override
    public WorkEffortSkillStandard save(WorkEffortSkillStandard skillStandard) {
        var entity = mapper.toEntity(skillStandard);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
