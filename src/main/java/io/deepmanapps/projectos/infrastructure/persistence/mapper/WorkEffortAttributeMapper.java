package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAttribute;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAttributeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortAttributeMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortAttribute toDomain(WorkEffortAttributeJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return WorkEffortAttribute.builder()
                .attrName(entity.getAttrName())
                .attrValue(entity.getAttrValue())
                .attrDescription(entity.getAttrDescription())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .build();
    }

    public WorkEffortAttributeJpaEntity toEntity(WorkEffortAttribute domain) {
        if (domain == null) {
            return null;
        }
        WorkEffortAttributeJpaEntity entity = new WorkEffortAttributeJpaEntity();
        entity.setAttrName(domain.getAttrName());
        entity.setAttrValue(domain.getAttrValue());
        entity.setAttrDescription(domain.getAttrDescription());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        return entity;
    }
}
