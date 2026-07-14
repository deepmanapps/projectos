package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.CostComponentType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.CostComponentTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class CostComponentTypeMapper {
    public CostComponentType toDomain(CostComponentTypeJpaEntity entity) {
        if (entity == null) return null;
        return CostComponentType.builder().costComponentTypeId(entity.getCostComponentTypeId()).build();
    }

    public CostComponentTypeJpaEntity toEntity(CostComponentType domain) {
        if (domain == null) return null;
        CostComponentTypeJpaEntity entity = new CostComponentTypeJpaEntity();
        entity.setCostComponentTypeId(domain.getCostComponentTypeId());
        return entity;
    }
}
