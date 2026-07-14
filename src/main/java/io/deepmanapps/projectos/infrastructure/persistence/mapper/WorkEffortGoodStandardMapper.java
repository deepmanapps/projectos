package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandard;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortGoodStandardJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortGoodStandardMapper {

    private final WorkEffortMapper workEffortMapper;
    private final ProductMapper productMapper;
    private final WorkEffortGoodStandardTypeMapper workEffortGoodStandardTypeMapper;
    private final StatusItemMapper statusItemMapper;

    public WorkEffortGoodStandard toDomain(WorkEffortGoodStandardJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortGoodStandard.builder()
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .estimatedQuantity(entity.getEstimatedQuantity())
                .estimatedCost(entity.getEstimatedCost())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .product(productMapper.toDomain(entity.getProduct()))
                .workEffortGoodStdType(workEffortGoodStandardTypeMapper.toDomain(entity.getWorkEffortGoodStdType()))
                .status(statusItemMapper.toDomain(entity.getStatus()))
                .build();
    }

    public WorkEffortGoodStandardJpaEntity toEntity(WorkEffortGoodStandard domain) {
        if (domain == null) return null;
        WorkEffortGoodStandardJpaEntity entity = new WorkEffortGoodStandardJpaEntity();
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setEstimatedQuantity(domain.getEstimatedQuantity());
        entity.setEstimatedCost(domain.getEstimatedCost());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setProduct(productMapper.toEntity(domain.getProduct()));
        entity.setWorkEffortGoodStdType(workEffortGoodStandardTypeMapper.toEntity(domain.getWorkEffortGoodStdType()));
        entity.setStatus(statusItemMapper.toEntity(domain.getStatus()));
        return entity;
    }
}
