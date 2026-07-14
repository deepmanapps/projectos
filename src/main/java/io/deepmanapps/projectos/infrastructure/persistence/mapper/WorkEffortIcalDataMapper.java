package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortIcalData;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortIcalDataJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortIcalDataMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortIcalData toDomain(WorkEffortIcalDataJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortIcalData.builder()
                .icalData(entity.getIcalData())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .build();
    }

    public WorkEffortIcalDataJpaEntity toEntity(WorkEffortIcalData domain) {
        if (domain == null) return null;
        WorkEffortIcalDataJpaEntity entity = new WorkEffortIcalDataJpaEntity();
        entity.setIcalData(domain.getIcalData());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        return entity;
    }
}
