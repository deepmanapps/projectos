package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Enumeration;
import io.deepmanapps.projectos.infrastructure.persistence.entity.EnumerationJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class EnumerationMapper {
    public Enumeration toDomain(EnumerationJpaEntity entity) {
        if (entity == null) return null;
        return Enumeration.builder().enumId(entity.getEnumId()).build();
    }

    public EnumerationJpaEntity toEntity(Enumeration domain) {
        if (domain == null) return null;
        EnumerationJpaEntity entity = new EnumerationJpaEntity();
        entity.setEnumId(domain.getEnumId());
        return entity;
    }
}
