package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortPurposeType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortPurposeTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortPurposeTypeMapper {

    public WorkEffortPurposeType toDomain(WorkEffortPurposeTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortPurposeType.builder()
                .workEffortPurposeTypeId(entity.getWorkEffortPurposeTypeId())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .build();
    }

    public WorkEffortPurposeTypeJpaEntity toEntity(WorkEffortPurposeType domain) {
        if (domain == null) return null;
        WorkEffortPurposeTypeJpaEntity entity = new WorkEffortPurposeTypeJpaEntity();
        entity.setWorkEffortPurposeTypeId(domain.getWorkEffortPurposeTypeId());
        entity.setDescription(domain.getDescription());
        entity.setParentType(toEntity(domain.getParentType()));
        return entity;
    }
}
