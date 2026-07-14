package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortTypeMapper {

    private final WorkEffortMapper workEffortMapper;
    private final WorkEffortTypeAttrMapper attributeMapper;

    public WorkEffortType toDomain(WorkEffortTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortType.builder()
                .workEffortTypeId(entity.getWorkEffortTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .workEfforts(entity.getWorkEfforts() != null ? entity.getWorkEfforts().stream().map(workEffortMapper::toDomain).collect(Collectors.toList()) : null)
                .attributes(entity.getAttributes() != null ? entity.getAttributes().stream().map(attributeMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortTypeJpaEntity toEntity(WorkEffortType domain) {
        if (domain == null) return null;
        WorkEffortTypeJpaEntity entity = new WorkEffortTypeJpaEntity();
        // ... scalar fields
        entity.setParentType(toEntity(domain.getParentType()));
        // ... collection fields
        return entity;
    }
}
