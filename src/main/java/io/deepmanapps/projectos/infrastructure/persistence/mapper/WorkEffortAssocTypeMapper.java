package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocType;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortAssocTypeMapper {

    private final WorkEffortAssocMapper assocMapper;
    private final WorkEffortAssocTypeAttrMapper attributeMapper;

    public WorkEffortAssocType toDomain(WorkEffortAssocTypeJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortAssocType.builder()
                .workEffortAssocTypeId(entity.getWorkEffortAssocTypeId())
                .hasTable(entity.getHasTable())
                .description(entity.getDescription())
                .parentType(toDomain(entity.getParentType()))
                .associations(entity.getAssociations() != null ? entity.getAssociations().stream().map(assocMapper::toDomain).collect(Collectors.toList()) : null)
                .attributes(entity.getAttributes() != null ? entity.getAttributes().stream().map(attributeMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortAssocTypeJpaEntity toEntity(WorkEffortAssocType domain) {
        if (domain == null) return null;
        WorkEffortAssocTypeJpaEntity entity = new WorkEffortAssocTypeJpaEntity();
        // ... scalar fields
        entity.setParentType(toEntity(domain.getParentType()));
        // ... collection fields
        return entity;
    }
}
