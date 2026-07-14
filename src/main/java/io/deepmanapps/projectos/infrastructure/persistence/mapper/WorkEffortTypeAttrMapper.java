package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortTypeAttr;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeAttrJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortTypeAttrMapper {

    private final WorkEffortTypeMapper workEffortTypeMapper;

    public WorkEffortTypeAttr toDomain(WorkEffortTypeAttrJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortTypeAttr.builder()
                .attrName(entity.getAttrName())
                .description(entity.getDescription())
                .workEffortType(workEffortTypeMapper.toDomain(entity.getWorkEffortType()))
                .build();
    }

    public WorkEffortTypeAttrJpaEntity toEntity(WorkEffortTypeAttr domain) {
        if (domain == null) return null;
        WorkEffortTypeAttrJpaEntity entity = new WorkEffortTypeAttrJpaEntity();
        entity.setAttrName(domain.getAttrName());
        entity.setDescription(domain.getDescription());
        entity.setWorkEffortType(workEffortTypeMapper.toEntity(domain.getWorkEffortType()));
        return entity;
    }
}
