package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandardType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortGoodStandardTypeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortGoodStandardTypeMapper {

    private final WorkEffortGoodStandardMapper goodStandardMapper;

    public WorkEffortGoodStandardType toDomain(WorkEffortGoodStandardTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortGoodStandardType.builder()
                .workEffortGoodStdTypeId(entity.getWorkEffortGoodStdTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .goodStandards(entity.getGoodStandards() != null ? entity.getGoodStandards().stream().map(goodStandardMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortGoodStandardTypeJpaEntity toEntity(WorkEffortGoodStandardType domain) {
        if (domain == null) return null;
        WorkEffortGoodStandardTypeJpaEntity entity = new WorkEffortGoodStandardTypeJpaEntity();
        // ... scalar fields
        entity.setParentType(toEntity(domain.getParentType()));
        // ... collection fields
        return entity;
    }
}
