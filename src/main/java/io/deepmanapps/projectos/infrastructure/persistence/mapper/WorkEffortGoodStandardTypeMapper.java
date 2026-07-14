package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandardType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortGoodStandardTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortGoodStandardTypeMapper {

    public WorkEffortGoodStandardType toDomain(WorkEffortGoodStandardTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortGoodStandardType.builder()
                .workEffortGoodStdTypeId(entity.getWorkEffortGoodStdTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .build();
    }

    public WorkEffortGoodStandardTypeJpaEntity toEntity(WorkEffortGoodStandardType domain) {
        if (domain == null) return null;
        WorkEffortGoodStandardTypeJpaEntity entity = new WorkEffortGoodStandardTypeJpaEntity();
        entity.setWorkEffortGoodStdTypeId(domain.getWorkEffortGoodStdTypeId());
        entity.setHasTable(domain.getHasTable());
        entity.setDescription(domain.getDescription());
        entity.setParentType(toEntity(domain.getParentType()));
        return entity;
    }
}
