package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Facility;
import io.deepmanapps.projectos.infrastructure.persistence.entity.FacilityJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class FacilityMapper {
    public Facility toDomain(FacilityJpaEntity entity) {
        if (entity == null) return null;
        return Facility.builder().facilityId(entity.getFacilityId()).build();
    }

    public FacilityJpaEntity toEntity(Facility domain) {
        if (domain == null) return null;
        FacilityJpaEntity entity = new FacilityJpaEntity();
        entity.setFacilityId(domain.getFacilityId());
        return entity;
    }
}
