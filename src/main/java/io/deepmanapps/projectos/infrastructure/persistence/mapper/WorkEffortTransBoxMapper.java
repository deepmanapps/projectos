package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortTransBox;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTransBoxJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortTransBoxMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortTransBox toDomain(WorkEffortTransBoxJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortTransBox.builder()
                .toActivityId(entity.getToActivityId())
                .transitionId(entity.getTransitionId())
                .processWorkEffort(workEffortMapper.toDomain(entity.getProcessWorkEffort()))
                .build();
    }

    public WorkEffortTransBoxJpaEntity toEntity(WorkEffortTransBox domain) {
        if (domain == null) return null;
        WorkEffortTransBoxJpaEntity entity = new WorkEffortTransBoxJpaEntity();
        entity.setToActivityId(domain.getToActivityId());
        entity.setTransitionId(domain.getTransitionId());
        entity.setProcessWorkEffort(workEffortMapper.toEntity(domain.getProcessWorkEffort()));
        return entity;
    }
}
