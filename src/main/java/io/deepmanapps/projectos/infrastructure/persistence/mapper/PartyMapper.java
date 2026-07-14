package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Party;
import io.deepmanapps.projectos.infrastructure.persistence.entity.PartyJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class PartyMapper {
    public Party toDomain(PartyJpaEntity entity) {
        if (entity == null) return null;
        return Party.builder().partyId(entity.getPartyId()).build();
    }

    public PartyJpaEntity toEntity(Party domain) {
        if (domain == null) return null;
        PartyJpaEntity entity = new PartyJpaEntity();
        entity.setPartyId(domain.getPartyId());
        return entity;
    }
}
