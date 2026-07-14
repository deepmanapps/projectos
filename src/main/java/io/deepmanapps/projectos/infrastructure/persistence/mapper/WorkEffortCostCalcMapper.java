package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortCostCalc;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortCostCalcJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortCostCalcMapper {

    private final WorkEffortMapper workEffortMapper;
    private final CostComponentTypeMapper costComponentTypeMapper;
    private final CostComponentCalcMapper costComponentCalcMapper;

    public WorkEffortCostCalc toDomain(WorkEffortCostCalcJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortCostCalc.builder()
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .costComponentType(costComponentTypeMapper.toDomain(entity.getCostComponentType()))
                .costComponentCalc(costComponentCalcMapper.toDomain(entity.getCostComponentCalc()))
                .build();
    }

    public WorkEffortCostCalcJpaEntity toEntity(WorkEffortCostCalc domain) {
        if (domain == null) return null;
        WorkEffortCostCalcJpaEntity entity = new WorkEffortCostCalcJpaEntity();
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setCostComponentType(costComponentTypeMapper.toEntity(domain.getCostComponentType()));
        entity.setCostComponentCalc(costComponentCalcMapper.toEntity(domain.getCostComponentCalc()));
        return entity;
    }
}
