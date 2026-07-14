package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortContentType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortContentTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortContentTypeMapper {

    public WorkEffortContentType toDomain(WorkEffortContentTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortContentType.builder()
                .workEffortContentTypeId(entity.getWorkEffortContentTypeId())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .build();
    }

    public WorkEffortContentTypeJpaEntity toEntity(WorkEffortContentType domain) {
        if (domain == null) return null;
        WorkEffortContentTypeJpaEntity entity = new WorkEffortContentTypeJpaEntity();
        entity.setWorkEffortContentTypeId(domain.getWorkEffortContentTypeId());
        entity.setDescription(domain.getDescription());
        entity.setParentType(toEntity(domain.getParentType()));
        return entity;
    }
}
