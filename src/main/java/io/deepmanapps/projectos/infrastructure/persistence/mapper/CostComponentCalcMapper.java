package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.CostComponentCalc;
import io.deepmanapps.projectos.infrastructure.persistence.entity.CostComponentCalcJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class CostComponentCalcMapper {
    public CostComponentCalc toDomain(CostComponentCalcJpaEntity entity) {
        if (entity == null) return null;
        return CostComponentCalc.builder().costComponentCalcId(entity.getCostComponentCalcId()).build();
    }

    public CostComponentCalcJpaEntity toEntity(CostComponentCalc domain) {
        if (domain == null) return null;
        CostComponentCalcJpaEntity entity = new CostComponentCalcJpaEntity();
        entity.setCostComponentCalcId(domain.getCostComponentCalcId());
        return entity;
    }
}
