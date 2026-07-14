package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.StatusItem;
import io.deepmanapps.projectos.infrastructure.persistence.entity.StatusItemJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class StatusItemMapper {
    public StatusItem toDomain(StatusItemJpaEntity entity) {
        if (entity == null) return null;
        return StatusItem.builder().statusId(entity.getStatusId()).build();
    }

    public StatusItemJpaEntity toEntity(StatusItem domain) {
        if (domain == null) return null;
        StatusItemJpaEntity entity = new StatusItemJpaEntity();
        entity.setStatusId(domain.getStatusId());
        return entity;
    }
}
