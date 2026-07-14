package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortAssocTypeMapper {

    public WorkEffortAssocType toDomain(WorkEffortAssocTypeJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return WorkEffortAssocType.builder()
                .workEffortAssocTypeId(entity.getWorkEffortAssocTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType())) // Recursive call
                .build();
    }

    public WorkEffortAssocTypeJpaEntity toEntity(WorkEffortAssocType domain) {
        if (domain == null) {
            return null;
        }
        WorkEffortAssocTypeJpaEntity entity = new WorkEffortAssocTypeJpaEntity();
        entity.setWorkEffortAssocTypeId(domain.getWorkEffortAssocTypeId());
        entity.setHasTable(domain.getHasTable());
        entity.setDescription(domain.getDescription());
        entity.setParentType(toEntity(domain.getParentType())); // Recursive call
        return entity;
    }
}
