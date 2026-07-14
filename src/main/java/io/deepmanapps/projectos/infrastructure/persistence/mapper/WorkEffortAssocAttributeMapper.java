package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocAttribute;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocAttributeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocAttributeMapper {

    private final WorkEffortAssocMapper workEffortAssocMapper;

    public WorkEffortAssocAttribute toDomain(WorkEffortAssocAttributeJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return WorkEffortAssocAttribute.builder()
                .attrName(entity.getAttrName())
                .attrValue(entity.getAttrValue())
                .attrDescription(entity.getAttrDescription())
                .workEffortAssoc(workEffortAssocMapper.toDomain(entity.getWorkEffortAssoc()))
                .build();
    }

    public WorkEffortAssocAttributeJpaEntity toEntity(WorkEffortAssocAttribute domain) {
        if (domain == null) {
            return null;
        }
        WorkEffortAssocAttributeJpaEntity entity = new WorkEffortAssocAttributeJpaEntity();
        entity.setAttrName(domain.getAttrName());
        entity.setAttrValue(domain.getAttrValue());
        entity.setAttrDescription(domain.getAttrDescription());
        entity.setWorkEffortAssoc(workEffortAssocMapper.toEntity(domain.getWorkEffortAssoc()));
        if (domain.getWorkEffortAssoc() != null && domain.getWorkEffortAssoc().getWorkEffortFrom() != null) {
            entity.setWorkEffortIdFrom(domain.getWorkEffortAssoc().getWorkEffortFrom().getWorkEffortId());
        }
        if (domain.getWorkEffortAssoc() != null && domain.getWorkEffortAssoc().getWorkEffortTo() != null) {
            entity.setWorkEffortIdTo(domain.getWorkEffortAssoc().getWorkEffortTo().getWorkEffortId());
        }
        if (domain.getWorkEffortAssoc() != null) {
            entity.setWorkEffortAssocTypeId(domain.getWorkEffortAssoc().getWorkEffortAssocTypeId());
            entity.setFromDate(domain.getWorkEffortAssoc().getFromDate());
        }
        return entity;
    }
}
