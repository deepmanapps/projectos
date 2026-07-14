package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortTypeMapper {

    public WorkEffortType toDomain(WorkEffortTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortType.builder()
                .workEffortTypeId(entity.getWorkEffortTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .build();
    }

    public WorkEffortTypeJpaEntity toEntity(WorkEffortType domain) {
        if (domain == null) return null;
        WorkEffortTypeJpaEntity entity = new WorkEffortTypeJpaEntity();
        entity.setWorkEffortTypeId(domain.getWorkEffortTypeId());
        entity.setHasTable(domain.getHasTable());
        entity.setDescription(domain.getDescription());
        entity.setParentType(toEntity(domain.getParentType()));
        return entity;
    }
}
