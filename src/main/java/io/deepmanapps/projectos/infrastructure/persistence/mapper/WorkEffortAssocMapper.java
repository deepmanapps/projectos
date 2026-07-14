package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortAssoc;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortAssoc toDomain(WorkEffortAssocJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return WorkEffortAssoc.builder()
                .workEffortAssocTypeId(entity.getWorkEffortAssocTypeId())
                .sequenceNum(entity.getSequenceNum())
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .workEffortFrom(workEffortMapper.toDomain(entity.getWorkEffortFrom()))
                .workEffortTo(workEffortMapper.toDomain(entity.getWorkEffortTo()))
                .build();
    }

    public WorkEffortAssocJpaEntity toEntity(WorkEffortAssoc domain) {
        if (domain == null) {
            return null;
        }
        WorkEffortAssocJpaEntity entity = new WorkEffortAssocJpaEntity();
        entity.setWorkEffortAssocTypeId(domain.getWorkEffortAssocTypeId());
        entity.setSequenceNum(domain.getSequenceNum());
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setWorkEffortFrom(workEffortMapper.toEntity(domain.getWorkEffortFrom()));
        entity.setWorkEffortTo(workEffortMapper.toEntity(domain.getWorkEffortTo()));
        return entity;
    }
}
