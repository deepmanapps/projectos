package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocTypeAttr;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeAttrJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocTypeAttrMapper {

    private final WorkEffortAssocTypeMapper workEffortAssocTypeMapper;

    public WorkEffortAssocTypeAttr toDomain(WorkEffortAssocTypeAttrJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return WorkEffortAssocTypeAttr.builder()
                .attrName(entity.getAttrName())
                .description(entity.getDescription())
                .workEffortAssocType(workEffortAssocTypeMapper.toDomain(entity.getWorkEffortAssocType()))
                .build();
    }

    public WorkEffortAssocTypeAttrJpaEntity toEntity(WorkEffortAssocTypeAttr domain) {
        if (domain == null) {
            return null;
        }
        WorkEffortAssocTypeAttrJpaEntity entity = new WorkEffortAssocTypeAttrJpaEntity();
        entity.setAttrName(domain.getAttrName());
        entity.setDescription(domain.getDescription());
        entity.setWorkEffortAssocType(workEffortAssocTypeMapper.toEntity(domain.getWorkEffortAssocType()));
        return entity;
    }
}
