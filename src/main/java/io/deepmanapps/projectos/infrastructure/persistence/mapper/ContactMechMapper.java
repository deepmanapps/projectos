package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.ContactMech;
import io.deepmanapps.projectos.infrastructure.persistence.entity.ContactMechJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ContactMechMapper {
    public ContactMech toDomain(ContactMechJpaEntity entity) {
        if (entity == null) return null;
        return ContactMech.builder().contactMechId(entity.getContactMechId()).build();
    }

    public ContactMechJpaEntity toEntity(ContactMech domain) {
        if (domain == null) return null;
        ContactMechJpaEntity entity = new ContactMechJpaEntity();
        entity.setContactMechId(domain.getContactMechId());
        return entity;
    }
}
