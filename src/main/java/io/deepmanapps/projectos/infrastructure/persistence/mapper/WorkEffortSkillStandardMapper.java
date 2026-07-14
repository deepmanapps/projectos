package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortSkillStandard;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSkillStandardJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSkillStandardMapper {

    private final WorkEffortMapper workEffortMapper;
    private final SkillTypeMapper skillTypeMapper;

    public WorkEffortSkillStandard toDomain(WorkEffortSkillStandardJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortSkillStandard.builder()
                .estimatedNumPeople(entity.getEstimatedNumPeople())
                .estimatedDuration(entity.getEstimatedDuration())
                .estimatedCost(entity.getEstimatedCost())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .skillType(skillTypeMapper.toDomain(entity.getSkillType()))
                .build();
    }

    public WorkEffortSkillStandardJpaEntity toEntity(WorkEffortSkillStandard domain) {
        if (domain == null) return null;
        WorkEffortSkillStandardJpaEntity entity = new WorkEffortSkillStandardJpaEntity();
        entity.setEstimatedNumPeople(domain.getEstimatedNumPeople());
        entity.setEstimatedDuration(domain.getEstimatedDuration());
        entity.setEstimatedCost(domain.getEstimatedCost());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setSkillType(skillTypeMapper.toEntity(domain.getSkillType()));
        return entity;
    }
}
