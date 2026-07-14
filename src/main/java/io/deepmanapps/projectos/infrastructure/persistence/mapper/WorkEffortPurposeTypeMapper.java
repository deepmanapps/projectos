package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortPurposeType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortPurposeTypeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortPurposeTypeMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortPurposeType toDomain(WorkEffortPurposeTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortPurposeType.builder()
                .workEffortPurposeTypeId(entity.getWorkEffortPurposeTypeId())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .workEfforts(entity.getWorkEfforts() != null ? entity.getWorkEfforts().stream().map(workEffortMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortPurposeTypeJpaEntity toEntity(WorkEffortPurposeType domain) {
        if (domain == null) return null;
        WorkEffortPurposeTypeJpaEntity entity = new WorkEffortPurposeTypeJpaEntity();
        // ... scalar fields
        entity.setParentType(toEntity(domain.getParentType()));
        // ... collection fields
        return entity;
    }
}
