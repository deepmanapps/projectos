package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.UserLogin;
import io.deepmanapps.projectos.infrastructure.persistence.entity.UserLoginJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class UserLoginMapper {
    public UserLogin toDomain(UserLoginJpaEntity entity) {
        if (entity == null) return null;
        return UserLogin.builder().userLoginId(entity.getUserLoginId()).build();
    }

    public UserLoginJpaEntity toEntity(UserLogin domain) {
        if (domain == null) return null;
        UserLoginJpaEntity entity = new UserLoginJpaEntity();
        entity.setUserLoginId(domain.getUserLoginId());
        return entity;
    }
}
