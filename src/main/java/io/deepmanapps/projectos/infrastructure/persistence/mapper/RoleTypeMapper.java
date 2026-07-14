package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.RoleType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.RoleTypeJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleTypeMapper {
    public RoleType toDomain(RoleTypeJpaEntity entity) {
        if (entity == null) return null;
        return RoleType.builder().roleTypeId(entity.getRoleTypeId()).build();
    }

    public RoleTypeJpaEntity toEntity(RoleType domain) {
        if (domain == null) return null;
        RoleTypeJpaEntity entity = new RoleTypeJpaEntity();
        entity.setRoleTypeId(domain.getRoleTypeId());
        return entity;
    }
}
