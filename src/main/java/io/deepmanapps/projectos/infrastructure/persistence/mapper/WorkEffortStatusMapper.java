package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortStatus;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortStatusJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortStatusMapper {

    private final WorkEffortMapper workEffortMapper;
    private final StatusItemMapper statusItemMapper;
    private final UserLoginMapper userLoginMapper;

    public WorkEffortStatus toDomain(WorkEffortStatusJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortStatus.builder()
                .statusDatetime(entity.getStatusDatetime())
                .reason(entity.getReason())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .status(statusItemMapper.toDomain(entity.getStatus()))
                .setByUserLogin(userLoginMapper.toDomain(entity.getSetByUserLogin()))
                .build();
    }

    public WorkEffortStatusJpaEntity toEntity(WorkEffortStatus domain) {
        if (domain == null) return null;
        WorkEffortStatusJpaEntity entity = new WorkEffortStatusJpaEntity();
        entity.setStatusDatetime(domain.getStatusDatetime());
        entity.setReason(domain.getReason());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setStatus(statusItemMapper.toEntity(domain.getStatus()));
        entity.setSetByUserLogin(userLoginMapper.toEntity(domain.getSetByUserLogin()));
        return entity;
    }
}
