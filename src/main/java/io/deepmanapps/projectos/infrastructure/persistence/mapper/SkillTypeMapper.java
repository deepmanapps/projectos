package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.SkillType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.SkillTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class SkillTypeMapper {
    public SkillType toDomain(SkillTypeJpaEntity entity) {
        if (entity == null) return null;
        return SkillType.builder().skillTypeId(entity.getSkillTypeId()).build();
    }

    public SkillTypeJpaEntity toEntity(SkillType domain) {
        if (domain == null) return null;
        SkillTypeJpaEntity entity = new SkillTypeJpaEntity();
        entity.setSkillTypeId(domain.getSkillTypeId());
        return entity;
    }
}
