package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Content;
import io.deepmanapps.projectos.infrastructure.persistence.entity.ContentJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ContentMapper {
    public Content toDomain(ContentJpaEntity entity) {
        if (entity == null) return null;
        return Content.builder()
                .contentId(entity.getContentId())
                .description(entity.getDescription())
                .build();
    }

    public ContentJpaEntity toEntity(Content domain) {
        if (domain == null) return null;
        ContentJpaEntity entity = new ContentJpaEntity();
        entity.setContentId(domain.getContentId());
        entity.setDescription(domain.getDescription());
        return entity;
    }
}
