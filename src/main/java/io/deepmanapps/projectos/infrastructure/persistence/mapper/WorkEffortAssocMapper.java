package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssoc;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortAssocMapper {

    private final WorkEffortMapper workEffortMapper;
    private final WorkEffortAssocAttributeMapper attributeMapper;

    public WorkEffortAssoc toDomain(WorkEffortAssocJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortAssoc.builder()
                .workEffortAssocTypeId(entity.getWorkEffortAssocTypeId())
                .sequenceNum(entity.getSequenceNum())
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .workEffortFrom(workEffortMapper.toDomain(entity.getWorkEffortFrom()))
                .workEffortTo(workEffortMapper.toDomain(entity.getWorkEffortTo()))
                .attributes(entity.getAttributes() != null ? entity.getAttributes().stream().map(attributeMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortAssocJpaEntity toEntity(WorkEffortAssoc domain) {
        if (domain == null) return null;
        WorkEffortAssocJpaEntity entity = new WorkEffortAssocJpaEntity();
        entity.setWorkEffortAssocTypeId(domain.getWorkEffortAssocTypeId());
        entity.setSequenceNum(domain.getSequenceNum());
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setWorkEffortFrom(workEffortMapper.toEntity(domain.getWorkEffortFrom()));
        entity.setWorkEffortTo(workEffortMapper.toEntity(domain.getWorkEffortTo()));
        if (domain.getAttributes() != null) {
            entity.setAttributes(domain.getAttributes().stream().map(attributeMapper::toEntity).collect(Collectors.toList()));
            entity.getAttributes().forEach(a -> a.setWorkEffortAssoc(entity));
        }
        return entity;
    }
}
